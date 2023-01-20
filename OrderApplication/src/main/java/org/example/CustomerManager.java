package org.example;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerManager {
    //List for individual customers
    List<IndividualCustomer> individualCustomers;
    //List for corporate customers
    List<CorporateCustomer> corporateCustomers;
    public CustomerManager() {
        this.individualCustomers = new ArrayList<>();
        this.corporateCustomers = new ArrayList<>();
    }
    //Add for individual customers
    public void addIndividualCustomer(IndividualCustomer customer){
        individualCustomers.add(customer);
    }
    //Add for corporate customers
    public void addCorporateCustomer(CorporateCustomer customer){
        corporateCustomers.add(customer);
    }
    //List all customers
    public void getAllCustomers(){
        System.out.println("Individual Customers");
        for (IndividualCustomer customer: individualCustomers) {
            System.out.println(
                    "Customer Id: " + customer.id +
                            " First Name: " + customer.firstName +
                            " Last Name: " + customer.lastName +
                    " Created Date: " + customer.createdDate +
                    " Bills: " + customer._bills.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
        }
        System.out.println("Corporate Customers");
        for (CorporateCustomer customer: corporateCustomers) {
            System.out.println(
                    "Customer Id: " + customer.id +
                            " Name: " + customer.name +
                            " Sector: " + customer.sector +
                            " Created Date: " + customer.createdDate +
                            " Bills: " + customer._bills.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
        }
    }
    //List customers contains 'C'
    public void getCustomersContainsC(){
        for (IndividualCustomer customer:individualCustomers) {
            if(customer.firstName.toUpperCase().contains("C")){
                System.out.println(
                        "Customer Id: " + customer.id +
                                " First Name: " + customer.firstName +
                                " Last Name: " + customer.lastName +
                                " Created Date: " + customer.createdDate +
                        " Bills: " + customer._bills.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
            }
        }
    }
    //Total Price Of Bills Of Customers Created In June
    public void getCustomersWithCreatedMonthJune(){
        int totalPrice = 0;
        for (IndividualCustomer customer:individualCustomers) {
            if(customer.createdDate.getMonth() == Month.JUNE){
                List<Bill> result = customer._bills.stream().collect(Collectors.toList());
                for (Bill bill:result
                     ) {
                    totalPrice += bill.price;
                }
            }
    }
        for (CorporateCustomer customer:corporateCustomers) {
            if(customer.createdDate.getMonth() == Month.JUNE){
                List<Bill> result = customer._bills.stream().collect(Collectors.toList());
                for (Bill bill:result
                ) {
                    totalPrice += bill.price;
                }
            }
        }
        System.out.println("Total price: " + totalPrice);
    }
    //List all bills
    public void getAllBills(){
        for (Customer customer: individualCustomers
             ) {
            System.out.println(customer._bills.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
        }
        for (Customer customer: corporateCustomers
        ) {
            System.out.println(customer._bills.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
        }
    }
    //List all bills greater than 1500
    public void getAllBillsGreaterThan1500(){
        for (Customer customer: individualCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price > 1500).collect(Collectors.toList());
            if(result.size()>0){
                System.out.println(result.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
            }
        }
        for (Customer customer: corporateCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price > 1500).collect(Collectors.toList());
            if(result.size()>0){
                System.out.println(result.stream().map(b-> "Id: " + b.id + " Price: " + b.price + " Month: " + b.billMonth).collect(Collectors.toList()));
            }
        }
    }
    //Calculate average of bills greater than 1500
    public void calculateAverageBillsGreaterThan1500(){
        List<Integer> avgResult = new ArrayList<>();
        int sum = 0;
        for (Customer customer: individualCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price > 1500).collect(Collectors.toList());
            for (Bill bill:result
                 ) {
                avgResult.add(bill.price);
            }
        }
        for (Customer customer: corporateCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price > 1500).collect(Collectors.toList());
            for (Bill bill:result
            ) {
                avgResult.add(bill.price);
            }
        }
        for (int i:avgResult
             ) {
            sum += i;
        }
        System.out.println(sum/avgResult.size());
    }
    //List names of customers with bills under 500TL in the system
    public void getAllCustomersLessThan500(){
        for (IndividualCustomer customer: individualCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price < 500).collect(Collectors.toList());
            if(result.size()>0){
                System.out.println(customer.firstName);
            }
        }
    }
    //List in which sector the companies with bill of less than 750 in June are
    public void getCorporateCustomersFiltered(){
        for (CorporateCustomer customer: corporateCustomers
        ) {
            List<Bill> result = customer._bills.stream().filter(b->b.price < 750).filter(b->b.billMonth == Month.JUNE).collect(Collectors.toList());
            if(result.size()>0){
                System.out.println(customer.sector);
            }
        }
    }
}
