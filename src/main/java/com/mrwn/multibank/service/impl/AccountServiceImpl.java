package com.mrwn.multibank.service.impl;

import com.mrwn.multibank.repository.AccountRepository;
import com.mrwn.multibank.service.AccountService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AccountServiceImpl implements AccountService {

    @Inject
    AccountRepository accountRepository;

    @Override
    public String getAccount(String accountId) {
        return "";
    }
}
