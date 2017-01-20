package com.brynlloyd;

/**
 * Created by bryn.lloyd on 20/01/2017.
 */
public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account (){
        this("56789", 2.50, "Default Name", "Default Address", "00000 0000000");
        System.out.println("Empty constructor called");
    }

    public Account (String number, double balance, String customerName, String customerEmailAddress,
                    String customerPhoneNumber){
        System.out.println("Account with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of £" + depositAmount + " made. New balance is £" + this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if (balance >= withdrawalAmount){
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of £" + withdrawalAmount + " processed. Remaining balance = £" + balance);
        }else{
            System.out.println("Only £" + this.balance + " available. Withdrawal not processed.");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
