package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes).
	    int myIntValue = 5/2;
        //width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        //width of double = 364 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numOfPounds = 200d;
        double kilogramsInAPound = numOfPounds * 0.45359237d;
        System.out.println(numOfPounds + " pound/s is equal to " + kilogramsInAPound + " kilograms");
        // 90.7185

    }
}
