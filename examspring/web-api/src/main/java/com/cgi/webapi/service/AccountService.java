package com.cgi.webapi.service;


import com.cgi.webapi.model.Account;

import java.util.List;

public interface AccountService {

    Account add(Account account);

    List<Account> getAll();


    Account getById(int id);

    Account deleteById(int id);

}
