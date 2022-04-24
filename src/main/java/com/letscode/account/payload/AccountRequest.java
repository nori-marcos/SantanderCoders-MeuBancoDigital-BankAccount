package com.letscode.account.payload;

import com.letscode.account.model.AccountType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AccountRequest {
    private Integer accountNumber;
    private Integer agency;
    private BigDecimal balance;
    private AccountType accountType;
}
