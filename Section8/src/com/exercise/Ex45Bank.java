package com.exercise;

import java.util.ArrayList;

public class Ex45Bank {

    private String name;
    private ArrayList<Ex45Branch> branches;

    public Ex45Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Ex45Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Ex45Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Ex45Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Ex45Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Ex45Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Ex45Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Ex45Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Ex45Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Ex45Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " +branchCustomer.getName()+ "[" +(i+1)+ "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" +(j+1) + "]  Amount " +transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
