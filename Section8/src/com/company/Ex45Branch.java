package com.company;

import java.util.ArrayList;

public class Ex45Branch {

    private String name;
    private ArrayList<Ex45Customer> customers;

    public Ex45Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Ex45Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ex45Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Ex45Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Ex45Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Ex45Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Ex45Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
