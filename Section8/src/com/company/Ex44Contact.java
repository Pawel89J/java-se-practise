package com.company;

public class Ex44Contact {

    private String name;
    private String phoneNumber;

    public Ex44Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Ex44Contact createContact(String name, String phoneNumber) {
        return new Ex44Contact(name, phoneNumber);
    }
}
