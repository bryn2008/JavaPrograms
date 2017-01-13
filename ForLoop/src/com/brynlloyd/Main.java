package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + caculateUnterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + caculateUnterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + caculateUnterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + caculateUnterest(10000.0, 5.0));
    }

    public static double caculateUnterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}