package com.letscode.account.service;

import com.letscode.account.model.TransactionMessage;
import com.letscode.account.payload.TransactionMessageRequest;
import com.letscode.account.payload.TransactionResponse;
import com.letscode.account.repository.TransactionMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionMessageServiceImpl implements TransactionMessageService{

    @Autowired
    TransactionMessageRepository transactionMessageRepository;

    @Override
    public TransactionMessage create(TransactionMessageRequest transactionMessageRequest) {

        TransactionMessage transactionMessage = new TransactionMessage(transactionMessageRequest);

        transactionMessage = transactionMessageRepository.save(transactionMessage);

        return transactionMessage;
    }

    @Override
    public List<TransactionMessage> getAll() {
        return transactionMessageRepository.findAll();
    }
}
