package com.letscode.account.service;

import com.letscode.account.model.Account;
import com.letscode.account.payload.AccountRequest;
import com.letscode.account.payload.AccountResponse;
import com.letscode.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountResponse create(AccountRequest accountRequest) {

        Account account = new Account(accountRequest);

        account = accountRepository.save(account);

        return new AccountResponse(account);
    }

    @Override
    public AccountResponse update(AccountRequest accountRequest, Integer id) {

        Account account = accountRepository.getById(id);

        account.setAccountNumber(accountRequest.getAccountNumber());
        account.setAgency(accountRequest.getAgency());
        account.setBalance(accountRequest.getBalance());
        account.setAccountType(accountRequest.getAccountType());

        account = accountRepository.save(account);

        return new AccountResponse(account);
    }

    @Override
    public List<AccountResponse> getAll() {
        List<Account> accounts = accountRepository.findAll();
        return AccountResponse.toResponse(accounts);
    }

    @Override
    public Account getById(Integer id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        var account = accountRepository.findById(id).orElseThrow();
        accountRepository.delete(account);
    }

}
