package net.banking.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@NoArgsConstructor
@AllArgsConstructor


public class AccountDto {
private Integer id;
private String accountHolderName;
private double balance;



}
