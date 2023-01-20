package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    int id;
    LocalDate createdDate;
    List<Bill> _bills;

    public Customer(int id, LocalDate createdDate, Bill... bills) {
        this.id = id;
        this.createdDate = createdDate;
        this._bills = new ArrayList<>(List.of(bills));
    }
}
