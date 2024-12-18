package com.ecom.controller;
import com.ecom.model.UserDtls;

public class TestUserDetls {
    public static void main(String[] args) {
        // Create a new UserDtls object
        UserDtls user = new UserDtls();

        // Test the Lombok-generated setter and getter methods
        user.setPassword("securePassword123"); 
        System.out.println("Password: " + user.getPassword());
    }
}
