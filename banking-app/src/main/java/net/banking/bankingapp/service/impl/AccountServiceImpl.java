package net.banking.bankingapp.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.banking.bankingapp.Mapper.AccountMapper;
import net.banking.bankingapp.dto.AccountDto;
import net.banking.bankingapp.entity.Account;
import net.banking.bankingapp.repository.AccountRepository;
import net.banking.bankingapp.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	
	


	@Autowired
	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
	
	

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		
		Account account = AccountMapper.mapToAccount(accountDto);
		System.out.println(account);
		Account saveAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(saveAccount);
		
	}
	public AccountDto getAccountById(Long id) {
		
		 Account account =   accountRepository
				 .findById(id)
				 .orElseThrow(()->new RuntimeException("Account does not exist"));
		return AccountMapper.mapToAccountDto(account);
	}
	
	 @Override
	    public AccountDto deposit(Long accountId, double amount) {
	        Account account = accountRepository.findById(accountId).orElseThrow(() -> new IllegalArgumentException("Account not found"));
	        double currentBalance = account.getBalance();
	        double newBalance = currentBalance + amount;
	        account.setBalance(newBalance);
	        Account savedAccount = accountRepository.save(account);
	        return AccountMapper.mapToAccountDto(savedAccount);
	    }
	 
	 
		  @Override
		    public AccountDto withdraw(Long id, double amount) {
		        Account account = accountRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Account not found"));
		        double currentBalance = account.getBalance();
		        double newBalance = currentBalance - amount;
		        account.setBalance(newBalance);
		        Account savedAccount = accountRepository.save(account);
		        return AccountMapper.mapToAccountDto(savedAccount);
		    }



		@Override
		public AccountDto withdraw(Long id, Double amount) {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public List<AccountDto> getAllAccounts() {
		List<Account>accounts = accountRepository.findAll();
		accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
			return null;
		}
		   
		@Override
		public Void deleteAccount(Long id) {
			System.out.println(id);
			Account account =   accountRepository
					 .findById(id)
					 .orElseThrow(()->new RuntimeException("Account does not exist"));
			accountRepository.deleteById(id);
		
			return  null;
			
		}

	

  
}
