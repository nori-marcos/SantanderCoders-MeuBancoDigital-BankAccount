package com.letscode.account.controller;

import com.letscode.account.payload.TransactionResponse;
import com.letscode.account.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping
    public List<TransactionResponse> getAll() {
        return transactionService.getAll();
    }

}
