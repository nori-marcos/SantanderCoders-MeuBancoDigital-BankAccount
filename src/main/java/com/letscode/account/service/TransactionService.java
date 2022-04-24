package com.letscode.account.service;

import com.letscode.account.payload.TransactionRequest;
import com.letscode.account.payload.TransactionResponse;

import java.util.List;

public interface TransactionService {
    TransactionResponse create(TransactionRequest transactionRequest);

    List<TransactionResponse> getAll();


}
