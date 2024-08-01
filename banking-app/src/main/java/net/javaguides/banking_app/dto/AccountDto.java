package net.javaguides.banking_app.dto;

import lombok.Data;

@Data
public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;
    
}
