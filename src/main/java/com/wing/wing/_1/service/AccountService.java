package com.wing.wing._1.service;

import com.wing.wing._1.model.AccountModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    // In-memory list to store account data
    private List<AccountModel> accountList = new ArrayList<>();

    // Method to get all stored accounts
    public List<AccountModel> getAllAccounts() {
        return accountList;
    }

    // Method to add new accounts to the list
    public List<AccountModel> addAccounts(List<AccountModel> accountModels) {
        accountList.addAll(accountModels); // Add the new accounts to the existing list
        return accountList; // Return the updated list of accounts
    }
}
