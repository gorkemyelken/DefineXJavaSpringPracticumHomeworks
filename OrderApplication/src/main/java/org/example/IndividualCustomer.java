package org.example;

import java.time.LocalDate;

public class IndividualCustomer extends Customer {

    String firstName;
    String lastName;

    public IndividualCustomer(int id, LocalDate createdDate, String firstName, String lastName, Bill... bills) {
        super(id, createdDate, bills);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
