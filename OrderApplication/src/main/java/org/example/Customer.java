package org.example;

import java.sql.Date;
import java.util.List;

public class Customer {

    int id;
    String firstName;
    String lastName;

    List<Bill> bills;

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
