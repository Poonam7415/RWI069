package net.banking.bankingapp.Mapper;

import net.banking.bankingapp.dto.AccountDto;
import net.banking.bankingapp.entity.Account;

public class AccountMapper {

	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				
				);
				
		
		return account;
		
	}
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
		account.getId(),
		account.getAccountHolderName(),
		account.getBalance()
		
				);
		
		return accountDto;
	}
	public static AccountDto mapToAccount(Account savedAccount) {
		// TODO Auto-generated method stub
		return null;
	}
}
