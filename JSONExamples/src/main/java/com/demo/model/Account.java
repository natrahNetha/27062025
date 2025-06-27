package com.demo.model;

import java.math.BigDecimal;

import com.demo.custom.CustomBalanceSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Account {

	private String accNumber;
    private String bankName;
    @JsonSerialize(using = CustomBalanceSerializer.class)
    
    private BigDecimal balance;

   
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

   
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

   
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

	@Override
	public String toString() {
		return "Order [accNumber=" + accNumber + ", bankName=" + bankName + ", balance=" + balance + "]";
	}
}
