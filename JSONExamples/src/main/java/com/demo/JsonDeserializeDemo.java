package com.demo;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.demo.model.Customer;
public class JsonDeserializeDemo {
    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
     
        Customer customer = mapper.readValue(new File("D:\\Java Projects\\WorkStation\\Spring-boot\\JSONExamples\\src\\main\\resources\\natraj.json"), Customer.class);
        
      System.out.println("hello final result");
        System.out.println("The Customer Object is: " + customer);
    }
}
