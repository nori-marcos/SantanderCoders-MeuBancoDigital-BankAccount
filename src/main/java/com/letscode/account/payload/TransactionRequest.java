package com.letscode.account.payload;

import com.letscode.account.model.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class TransactionRequest {
    private BigDecimal transactionValue;
    private TransactionType transactionType;
    private Integer agency;
    private Integer accountNumber;
}
