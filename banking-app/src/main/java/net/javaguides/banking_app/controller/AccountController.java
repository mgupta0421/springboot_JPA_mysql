package net.javaguides.banking_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @Operation(summary = "Create new account")
    @ApiResponse(responseCode = "200", description = "Account is created successfully")
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    } 

    @Operation(summary = "Getting account by account id")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Got account details by account id"),
        @ApiResponse(responseCode = "400", description = "Account not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable Long id){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    } 

    @Operation(summary = "Deposite amount in the account")
    @ApiResponse(responseCode = "200", description = "Amout added to the account")
    @PostMapping
    public ResponseEntity<AccountDto> deposit(Long id, double request){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    } 
    
}
 