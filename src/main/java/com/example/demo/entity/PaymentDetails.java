package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment_details")
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "sort_code")
    private int sortCode;

    public PaymentDetails() {
    }

    public PaymentDetails(int accountNumber, int sortCode) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", sortCode=" + sortCode +
                '}';
    }
}
