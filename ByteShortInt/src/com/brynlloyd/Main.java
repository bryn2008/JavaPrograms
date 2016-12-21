package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntValue = 2647;
        int myTotal = (myMinValue/2);
        System.out.println("MyTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myByteValue = 58;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myByteValue = " + myByteValue / 2);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myMaxLongValue = 9_223_372_036_854_775_807L;


        int total = myIntValue +  myByteValue + myShortValue;
        long myLongValue = 50000 * total;
    }
}
