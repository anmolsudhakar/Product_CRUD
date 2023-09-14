package com.cgi.webapi.controller;

import lombok.RequiredArgsConstructor;

import com.cgi.webapi.model.Account;
import com.cgi.webapi.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> findAll() {

        var accounts = accountService.getAll();
        if(accounts.isEmpty()) {

            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(200).body(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable int id) {

        var account = accountService.getById(id);
        if(account == null) {

            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(200).body(account);
    }

    @PostMapping
    public ResponseEntity<Account> addAccount (@RequestBody Account account) {
        List<Account> accounts = accountService.getAll();
        if (accounts.contains(account)) {

            return ResponseEntity.status(409).build();
        }
        return ResponseEntity.status(201).body(accountService.add(account));
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Account> deleteById(@PathVariable int id) {

        var account = accountService.deleteById(id);
        if(account == null) {

            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(200).body(account);
    }

}
