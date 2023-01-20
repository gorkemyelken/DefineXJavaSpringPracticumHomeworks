package org.example;

import java.time.Month;

public class Bill {
    int id;
    int price;
    Month billMonth;

    public Bill(int id, int price, Month billMonth) {
        this.id =id;
        this.price = price;
        this.billMonth = billMonth;
    }
}
