package com.letscode.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class BalanceUpdate {
    private Integer accountNumber;
    private Integer agency;
    private BigDecimal valueChange;
}
