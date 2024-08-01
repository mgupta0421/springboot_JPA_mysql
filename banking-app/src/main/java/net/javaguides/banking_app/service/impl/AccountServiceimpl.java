package net.javaguides.banking_app.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;

@Service
public class AccountServiceimpl implements AccountService{

    private AccountRepository accountRepository;

    public AccountServiceimpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
       return null;
    }
    
}
