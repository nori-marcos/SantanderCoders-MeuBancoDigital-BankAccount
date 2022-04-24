package com.letscode.account.service;

import com.letscode.account.model.Account;
import com.letscode.account.payload.AccountRequest;
import com.letscode.account.payload.AccountResponse;

import java.util.List;

public interface AccountService {
    AccountResponse create(AccountRequest accountRequest);

    AccountResponse update(AccountRequest accountRequest, Integer id);

    List<AccountResponse> getAll();

    Account getById(Integer id);

    void delete(Integer id);

}
