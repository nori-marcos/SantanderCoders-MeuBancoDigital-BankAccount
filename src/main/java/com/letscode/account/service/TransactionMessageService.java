package com.letscode.account.service;

import com.letscode.account.model.Transaction;
import com.letscode.account.model.TransactionMessage;
import com.letscode.account.payload.TransactionMessageRequest;
import com.letscode.account.payload.TransactionRequest;
import com.letscode.account.payload.TransactionResponse;

import java.util.List;

public interface TransactionMessageService {
    TransactionMessage create(TransactionMessageRequest transactionMessageRequest);
    List<TransactionMessage> getAll();
}
