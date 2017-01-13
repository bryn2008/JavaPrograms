package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + caculateUnterest(10000.0, 2.0));

        for (int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello");
        }

        for (int i=2; i<9; i++){
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f", caculateUnterest(10000.0, i)));
        }

        System.out.println("**************");

        for (int i=9; i>1; i--){
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f", caculateUnterest(10000.0, i)));
        }

        int pNumCount = 0;
        int totalNumbers = 50;
        for (int i=10; i<totalNumbers ; i++){
            boolean pNum = isPrime(i);
            if (pNum){
                pNumCount++;
                System.out.println(i + " is a Prime number");
                if(pNumCount == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("There are " + pNumCount + " prime numbers in " + totalNumbers);
    }

    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }

        for (int i=2; i<= n/2; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static double caculateUnterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
