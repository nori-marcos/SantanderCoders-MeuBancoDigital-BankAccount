package com.letscode.account.repository;

import com.letscode.account.model.TransactionMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMessageRepository extends JpaRepository<TransactionMessage, Integer> {

}
