package com.exercise;

import java.util.ArrayList;

public class Ex44MobilePhone {

    private String myNumber;
    private ArrayList<Ex44Contact> myEx44Contacts;

    public Ex44MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myEx44Contacts = new ArrayList<Ex44Contact>();
    }

    public boolean addNewContact(Ex44Contact ex44Contact) {
        if (findContact(ex44Contact) != -1) {
            return false;
        } else {
            return myEx44Contacts.add(ex44Contact);
        }
    }

    public boolean updateContact(Ex44Contact oldEx44Contact, Ex44Contact newEx44Contact) {
        if (findContact(oldEx44Contact) != -1) {
            return myEx44Contacts.remove(oldEx44Contact) && myEx44Contacts.add(newEx44Contact);
        } else {
            return false;
        }
    }

    public boolean removeContact(Ex44Contact ex44Contact) {
        return findContact(ex44Contact) == -1 ? false : myEx44Contacts.remove(ex44Contact);
    }

    private int findContact(Ex44Contact queryEx44Contact) {
        return findContact(queryEx44Contact.getName());
    }
    
    private int findContact(String contactName) {
        for (int i = 0; i < myEx44Contacts.size(); i++) {
            Ex44Contact ex44Contact = myEx44Contacts.get(i);
            if (ex44Contact.getName().equals(contactName)) {
                return i;
            }
        }
        return  -1;
    }

    public Ex44Contact queryContact(String contactName) {
        for (int i = 0; i < myEx44Contacts.size(); i++) {
            Ex44Contact ex44Contact = myEx44Contacts.get(i);
            if (ex44Contact.getName().equals(contactName)) {
                return ex44Contact;
            }
        }
        return  null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myEx44Contacts.size(); i++) {
            Ex44Contact ex44Contact = myEx44Contacts.get(i);
            System.out.println(i+1 + ". " + ex44Contact.getName()+ " -> " + ex44Contact.getPhoneNumber());
        }
    }
}
