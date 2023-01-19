package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Görkem","Yelken");
        CustomerManager customerManager = new CustomerManager();
        customerManager.addCustomer(customer1);
        customerManager.getAllCustomers();

    }
}