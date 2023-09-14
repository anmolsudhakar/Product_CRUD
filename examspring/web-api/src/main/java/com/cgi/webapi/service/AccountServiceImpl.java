package com.cgi.webapi.service;


import lombok.RequiredArgsConstructor;

import com.cgi.webapi.model.Account;
import com.cgi.webapi.repository.AccountRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private  final AccountRepository accountRepository;
    @Override
    public Account add(Account account) {

        return accountRepository.save(account);
    }



    @Override
    public List<Account> getAll() {

        return accountRepository.findAll();
    }



    @Override
    public Account getById(int id) {
        return accountRepository.findById(id).orElse(null);
    }
    @Override
    public Account deleteById(int id) {
        Account account = getById(id);
        if(account != null) {
            accountRepository.deleteById(id);
        }
        return account;
    }




}
