package com.letscode.account.JMS.listener;

import com.letscode.account.model.Transaction;
import com.letscode.account.payload.TransactionMessageRequest;
import com.letscode.account.payload.TransactionRequest;
import com.letscode.account.service.TransactionMessageService;
import com.letscode.account.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionListener {
    @Autowired
    TransactionMessageService transactionMessageService;

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, TransactionMessageRequest> payload) {
        log.info("Payload consumed {}", payload.key());
        System.out.println(payload.value());
        transactionMessageService.create(payload.value());
        //        transactionService.create(payload.value());
    }

}
