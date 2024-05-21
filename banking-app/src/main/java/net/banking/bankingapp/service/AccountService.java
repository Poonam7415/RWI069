package net.banking.bankingapp.service;

import java.util.List;

import net.banking.bankingapp.dto.AccountDto;


public interface AccountService {
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long id);

	AccountDto deposit(Long accountId, double amount);
	
	AccountDto withdraw(Long id,double amount);

	AccountDto withdraw(Long id, Double amount);
	
	List<AccountDto>getAllAccounts();
	
	Void deleteAccount(Long id);

	
	

}
