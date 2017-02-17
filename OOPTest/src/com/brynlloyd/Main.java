package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.65, "white");

        double price = hamburger.itemiseHamburgure();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Letuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println(hamburger.itemiseHamburgure());

        HealthyHamburger healthBurger = new HealthyHamburger("Bacon", 5.67);
        healthBurger.addHamburgerAddition1("egg", 5.43);
        healthBurger.addHealthyAddition1("Lentials", 3.41);
        System.out.println("Total Healthy Burgure price is " + healthBurger.itemiseHamburgure());

        DeluxeHamburger db = new DeluxeHamburger();
        db.addHamburgerAddition1("should not be able to do this", 999.99);
        db.itemiseHamburgure();

    }
}
