package com.letscode.account.payload;

import com.letscode.account.model.Account;
import com.letscode.account.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class AccountResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "agency")
    private Integer agency;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "creation_date")
    @CreatedDate
    private LocalDateTime creationDate;

    @Column(name = "update_date")
    @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime updateDate;

    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public AccountResponse(Account account){
        this.id = account.getId();
        this.accountNumber = account.getAccountNumber();
        this.agency = account.getAgency();
        this.balance = account.getBalance();
        this.creationDate = account.getCreationDate();
        this.updateDate = account.getUpdateDate();
        this.accountType = account.getAccountType();
    }

    public static List<AccountResponse> toResponse (List<Account> accounts){
        return accounts.stream().map(AccountResponse::new).collect(Collectors.toList());
    }
}
