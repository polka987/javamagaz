package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private String[] watchFirms;
    private String[][] brands;
    private ArrayList<Order> orders;

    public Shop(String[] watchFirms, String[][] brands) {
        this.watchFirms = watchFirms;
        this.brands = brands;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void displayOrders(){
        for (Order order: orders) {
            Customer customer = order.getCustomer();
            System.out.println("Фио клиента: " + customer.getName());
            System.out.println("Номер телефона: "+ customer.getNumber());
            System.out.println("Email клиента: "+ customer.getEmail());
            System.out.println("Позиции: " + customer.getPositions()[0] + ", " + customer.getPositions()[1]);
            System.out.println("Количество: " + customer.getQuantity());
            System.out.println();
        }
    }
    public void startOrder(Scanner sc){
        System.out.println("Пожалуйста, введите ФИО: ");
        String name = sc.nextLine();
        System.out.println("Пожалуйста, введите email: ");
        String email = sc.nextLine();
        System.out.println("Пожалуйста, введите номер телефона: ");
        String number = sc.nextLine();
        System.out.println("Доступные позиции: ");
        for (String[] position: brands){
            System.out.println(position[0] + " " + position[1]);
        }
        System.out.println("Введите индекс позиции: ");
        int index = sc.nextInt();
        System.out.println("Введите количество: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        String[] positions = {watchFirms[index], brands[index][1]};
        Customer customer = new Customer(name, email, number, positions, quantity);
        Order order = new Order(customer);
        addOrder(order);
    }
}
