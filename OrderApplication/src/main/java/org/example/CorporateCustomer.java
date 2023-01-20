package org.example;

import java.time.LocalDate;

public class CorporateCustomer extends Customer{
    String name;
    String sector;

    public CorporateCustomer(int id, LocalDate createdDate, String name, String sector, Bill... bills) {
        super(id, createdDate, bills);
        this.name = name;
        this.sector = sector;
    }
}
