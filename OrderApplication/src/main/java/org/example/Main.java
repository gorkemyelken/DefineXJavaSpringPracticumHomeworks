package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        Customer customer1 = new IndividualCustomer(1, LocalDate.of(2023, Month.JANUARY, 1),"Görkem","Yelken",new Bill(1,950, Month.JUNE),new Bill(2,2100, Month.SEPTEMBER));
        customerManager.addIndividualCustomer((IndividualCustomer) customer1);

        Customer customer2 = new IndividualCustomer(2, LocalDate.of(2023, Month.JUNE, 15),"Erdem","Yelken",new Bill(3,500, Month.AUGUST));
        customerManager.addIndividualCustomer((IndividualCustomer) customer2);

        Customer customer3 = new IndividualCustomer(3, LocalDate.of(2023, Month.JUNE, 18),"Dicle","Temel",new Bill(4,350, Month.MARCH), new Bill(5,1800, Month.APRIL));
        customerManager.addIndividualCustomer((IndividualCustomer) customer3);

        Customer customer4 = new CorporateCustomer(4,LocalDate.of(2023, Month.JANUARY, 18),"DefineX","Consulting, Technology & Labs",new Bill(6,3500, Month.MAY));
        customerManager.addCorporateCustomer((CorporateCustomer) customer4);

        Customer customer5 = new CorporateCustomer(5,LocalDate.of(2023, Month.JANUARY, 18),"Patika","Technology, Education",new Bill(7,300, Month.JUNE));
        customerManager.addCorporateCustomer((CorporateCustomer) customer5);

        System.out.println("All Customers");
        customerManager.getAllCustomers();

        System.out.println("**********");
        System.out.println("Customers Contain 'C'");
        customerManager.getCustomersContainsC();

        System.out.println("**********");
        System.out.println("Total Price Of Bills Of Customers Created In June");
        customerManager.getCustomersWithCreatedMonthJune();

        System.out.println("**********");
        System.out.println("All Bills");
        customerManager.getAllBills();

        System.out.println("**********");
        System.out.println("All Bills Greater Than 1500");
        customerManager.getAllBillsGreaterThan1500();

        System.out.println("**********");
        System.out.println("Average Of Bills Greater Than 1500");
        customerManager.calculateAverageBillsGreaterThan1500();

        System.out.println("**********");
        System.out.println("All Customers With Bills Less Than 500");
        customerManager.getAllCustomersLessThan500();

        System.out.println("**********");
        System.out.println("Filtered Corporate Customers");
        customerManager.getCorporateCustomersFiltered();
    }
}