package com.letscode.account.controller;

import com.letscode.account.model.Account;
import com.letscode.account.payload.AccountRequest;
import com.letscode.account.payload.AccountResponse;
import com.letscode.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public AccountResponse create(
            @RequestBody AccountRequest accountRequest) {
        return accountService.create(accountRequest);
    }

    @PutMapping("/{id}")
    public AccountResponse update(
            @RequestBody AccountRequest accountRequest,
            @PathVariable Integer id
            ) {
        return accountService.update(accountRequest, id);
    }

    @GetMapping
    public List<AccountResponse> getAll() {
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable Integer id) {
        return accountService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        accountService.delete(id);
    }

}
