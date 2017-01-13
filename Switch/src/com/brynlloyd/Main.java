package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1,2,3,4 or 5");
                break;
        }

        char switchChar = 'B';

        switch (switchChar) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value was C, or D, or E");
                System.out.println("Actually it was " + switchChar);
                break;

            default:
                System.out.println("Value was not A,B,C,D or E");
                break;
        }

        String month = "JuNe";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "febuary":
                System.out.println("Feb");
                break;
            case "june":
                System.out.println("June");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }

}
