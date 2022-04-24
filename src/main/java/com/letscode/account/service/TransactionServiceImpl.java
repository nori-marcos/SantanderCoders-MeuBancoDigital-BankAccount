package com.letscode.account.service;

import com.letscode.account.model.Transaction;
import com.letscode.account.payload.TransactionRequest;
import com.letscode.account.payload.TransactionResponse;
import com.letscode.account.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public TransactionResponse create(TransactionRequest transactionRequest) {

        Transaction transaction = new Transaction(transactionRequest);

            transaction = transactionRepository.save(transaction);

        return new TransactionResponse(transaction);
    }

    @Override
    public List<TransactionResponse> getAll() {

        List<Transaction> transactions = transactionRepository.findAll();

        return TransactionResponse.toResponse(transactions);
    }

}
