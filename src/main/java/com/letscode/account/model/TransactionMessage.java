package com.letscode.account.model;

import com.letscode.account.payload.TransactionMessageRequest;
import com.letscode.account.payload.TransactionRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "transaction_messages")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransactionMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "transaction_message")
    private String message;

    public TransactionMessage(TransactionMessageRequest transactionMessageRequest){
        this.message = transactionMessageRequest.getMessage();
    }
}
