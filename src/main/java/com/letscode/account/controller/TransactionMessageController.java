package com.letscode.account.controller;

import com.letscode.account.model.TransactionMessage;
import com.letscode.account.service.TransactionMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactionMessage")
public class TransactionMessageController {

    @Autowired
    TransactionMessageService transactionMessageService;

    @GetMapping
    public List<TransactionMessage> getAll() {
        return transactionMessageService.getAll();
    }

}
