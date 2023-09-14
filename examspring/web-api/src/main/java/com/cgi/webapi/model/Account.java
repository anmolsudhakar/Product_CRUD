package com.cgi.webapi.model;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="accounts_final")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name=" r_id")
    private int accountsId;

    @Column(name="r_name",nullable = false)
    private String name;

    @Column(name="r_address",nullable = false)
    private String address;

    @Column(name="r_account",nullable = false)
    private String accountType;

    @Column(name="r_status",nullable = false)
    private String status;


    public Account(String name, String address, String accountType, String status) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.status = status;
    }

}
