package com.brynlloyd;

/**
 * Created by bryn.lloyd on 20/01/2017.
 */
public class VipAccount {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipAccount() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipAccount(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipAccount(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
