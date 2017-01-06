package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        int myVariable=50;                                // the whole line is a valid Java Statement
        myVariable++;                                       // this is also a Java Statement
        myVariable--;                                       // this is also a Java Statement
        System.out.println("This is a test");               // this is also a Java Statement

        System.out.println("this is" +                      // this is a valid Java Statement over three lines
                " another" +
                " still more.");

        int anotherVariable = 50;myVariable--;System.out.println("This is multiple statments all on one line");

int myIndent=50;
myIndent++;
myIndent--;
System.out.println("Indenting is to see the logical flow of the code");

    }
}
