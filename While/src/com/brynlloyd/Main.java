package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
//        int count = 5;
//        while(count != 6){
//            System.out.println("Count value in while loop is " + count);
//            count++;
//        }
//
//        count = 3;
//        for(int i=1; i!= 6; i++){
//            System.out.println("Count value in for loop is " + count);
//        }
//
//        count = 1;
//        do{
//            System.out.println("Count value in do while loop is " + count);
//            count++;
//        } while (count != 6);

        int number = 5;
        int finishNumber = 20;
        int totalEvenNunbers = 0;
        while (number <= finishNumber){

            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            totalEvenNunbers++;

            if (totalEvenNunbers >= 5) {
                break;
            }

        }
        System.out.println("Total even numbers found is " + totalEvenNunbers);

    }

    public static boolean isEvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
