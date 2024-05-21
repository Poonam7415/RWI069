package net.banking.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.banking.bankingapp.entity.Account;

public interface AccountRepository  extends JpaRepository<Account, Long>{
	

}
