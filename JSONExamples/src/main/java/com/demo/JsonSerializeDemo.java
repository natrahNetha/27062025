package com.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.demo.model.Account;
import com.demo.model.Customer;
import com.demo.model.Order;

public class JsonSerializeDemo {
    public static void main(String[] args) throws JsonProcessingException {

        
        Customer customer = new Customer();
        customer.setFirstname("Natraj");
        customer.setLastname("Gagula");
        customer.setEmail("gangulanatraj@gmail.com");
        customer.setAddress("Nalgonda");
        customer.setDob(new Date());

        
        List<Order> orders = new ArrayList<>();

        Order order1 = new Order();
        order1.setOid(101);
        order1.setName("mobile");
        order1.setDescription("good");
        order1.setDelivered(true);

        Order order2 = new Order();
        order2.setOid(102);
        order2.setName("laptop");
        order2.setDescription("good");
        order2.setDelivered(true);

        Order order3 = new Order();
        order3.setOid(103);
        order3.setName("watch");
        order3.setDescription("good");
        order3.setDelivered(true);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        customer.setOrders(orders);

        
        Account account = new Account();
        account.setAccNumber("703279968710");
        account.setBalance(new BigDecimal(68000));
        account.setBankName("icici");

        customer.setAccount(account);

        
        ObjectMapper mapper = new ObjectMapper();
        String customerJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);

        
        System.out.println("The Customer JSON is:\n" + customerJson);
        
        try {
            mapper.writeValue(new File("D:\\Java Projects\\WorkStation\\Spring-boot\\JSONExamples\\src\\main\\resources\\natraj.json"), customer);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }












