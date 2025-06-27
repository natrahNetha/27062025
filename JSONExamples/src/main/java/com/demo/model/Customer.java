package com.demo.model;

import java.util.Date;
import java.util.List;

import com.demo.custom.CustomDateDeserialization;
import com.demo.custom.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonPropertyOrder({
    "first_name", "last_name", "account", "orders", "email", "address", "dob"
})
public class Customer {

    @JsonProperty("first_name")
    private String firstname;

    @JsonProperty("last_name")
    private String lastname;
    

    private String email;
    private String address;
    @JsonSerialize(using = CustomDateSerializer.class) 
    @JsonDeserialize(using = CustomDateDeserialization.class)
    private Date dob;
    private List<Order> orders;
    private Account account;

    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", address="
				+ address + ", dob=" + dob + ", orders=" + orders + ", account=" + account + "]";
	}

    
}
