package net.javaguides.banking_app.mapper;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

public class AccountMapper {
    
    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
        );
       return account;
        
    }
}
