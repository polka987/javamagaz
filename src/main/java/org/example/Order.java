package org.example;

public class Order {
    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    private Customer customer;


}
