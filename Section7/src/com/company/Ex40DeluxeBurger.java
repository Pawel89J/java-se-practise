package com.company;

public class Ex40DeluxeBurger extends Ex40Hamburger {

    public Ex40DeluxeBurger() {
        super("Deluxe","Sausage & Bacon",14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
