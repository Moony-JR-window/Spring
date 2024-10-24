package com.wing.wing._1.controller;

import com.wing.wing._1.model.AccountModel;
import com.wing.wing._1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<AccountModel> getAllAccounts() {
        // Return all stored accounts
        return accountService.getAllAccounts();
    }

    @PostMapping("/post")
    public List<AccountModel> postData(@RequestBody List<AccountModel> accountModels) {
        // Add the posted accounts to the stored list
        return accountService.addAccounts(accountModels);
    }
}
