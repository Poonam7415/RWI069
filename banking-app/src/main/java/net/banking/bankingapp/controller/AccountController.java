package net.banking.bankingapp.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.banking.bankingapp.dto.AccountDto;
import net.banking.bankingapp.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;

	}

	// Add account REST API
	@PostMapping("/save")
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
		System.out.println(accountDto);
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}
	
	//Get Account Rest API
	@GetMapping("get/{id}")
	public ResponseEntity<AccountDto>getAccountById(@PathVariable Long id){
		AccountDto accountDto = accountService.getAccountById(id);
		
		return ResponseEntity.ok(accountDto);
		
	}
	//Deposit Rest API
	@PutMapping("deposite/{id}")
	public ResponseEntity<AccountDto>deposit(@PathVariable Long id,@RequestBody Map<String,Double> request){
		Double amount = request.get("amount");
		
		AccountDto accountDto = accountService.deposit(id, amount);
		return ResponseEntity.ok(accountDto);
		
	}
	
	//Withdraw Rest API
	
	@PutMapping("withdraw/{id}")
	public ResponseEntity<AccountDto>withdraw(@PathVariable Long id,@RequestBody Map<String,Double> request){
		Double amount = request.get("amount");
		
		AccountDto accountDto = accountService.withdraw(id, amount);
		return ResponseEntity.ok(accountDto);
		
	}
	
	//Get All Accounts Rest API
	@GetMapping("/getAll")
	public ResponseEntity<List<AccountDto>> getAllAccounts(){
		List<AccountDto> accounts = accountService.getAllAccounts();
		return ResponseEntity.ok(accounts);
		
	}
	
	//Delete Account Rest API
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id){
		System.out.println("AccountController.deleteAccount()"+id);
		accountService.deleteAccount(id);
		
		return ResponseEntity.ok("Account is deleted by successfully!");
		
	}
	

}
