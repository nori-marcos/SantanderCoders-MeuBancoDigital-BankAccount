package com.letscode.account.model;

import com.letscode.account.payload.AccountRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "account")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Account {

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

    public Account(AccountRequest accountRequest){
        this.accountNumber = accountRequest.getAccountNumber();
        this.agency = accountRequest.getAgency();
        this.balance = accountRequest.getBalance();
        this.accountType = accountRequest.getAccountType();
    }
}
