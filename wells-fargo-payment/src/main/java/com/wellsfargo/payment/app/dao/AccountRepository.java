package com.wellsfargo.payment.app.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.payment.app.domain.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {

	Optional<Account> findByAccountNumber(int accountNumber);

}
