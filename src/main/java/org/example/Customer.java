package org.example;

import java.util.ArrayList;

public class Customer {

    public Customer(String name, String email, String number, String[] positions, int quantity) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.positions = positions;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    private String name;
    private String email;
    private String number;

    public String[] getPositions() {
        return positions;
    }

    private String[] positions;

    public int getQuantity() {
        return quantity;
    }

    private int quantity;
}

