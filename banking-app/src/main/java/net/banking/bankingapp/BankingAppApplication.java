package net.banking.bankingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.banking.bankingapp.dto.AccountDto;
import net.banking.bankingapp.service.AccountService;
import net.banking.bankingapp.service.impl.AccountServiceImpl;

@SpringBootApplication
public class BankingAppApplication {

	 
	public static void main(String[] args) {
	ApplicationContext ctx	=SpringApplication.run(BankingAppApplication.class, args);

	}

}
