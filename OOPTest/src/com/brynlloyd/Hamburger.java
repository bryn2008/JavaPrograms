package com.brynlloyd;

/**
 * Created by bryn.lloyd on 17/02/2017.
 */

// base class used for pricing

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double adition1Price;

    private String addition2Name;
    private double adition2Price;

    private String addition3Name;
    private double adition3Price;

    private String addition4Name;
    private double adition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.adition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
    this.addition2Name = name;
    this.adition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
    this.addition3Name = name;
    this.adition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
    this.addition4Name = name;
    this.adition4Price = price;
    }

    public double itemiseHamburgure(){
        double hamburgurePrice = this.price;
        System.out.println(this.name + " hamburgure"+ " on a " + this.breadRollType + " roll "
                            + "with " + this.meat + ", price is " + this.price);
        if(this.addition1Name != null){
            hamburgurePrice += this.adition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.adition1Price);
        }
        if(this.addition2Name != null){
            hamburgurePrice += this.adition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.adition2Price);
        }
        if(this.addition3Name != null){
            hamburgurePrice += this.adition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.adition3Price);
        }
        if(this.addition4Name != null){
            hamburgurePrice += this.adition4Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.adition3Price);
        }

        return hamburgurePrice ;
    }


}