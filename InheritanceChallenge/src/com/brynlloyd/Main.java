package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        Jaguar eType = new Jaguar(36);
        eType.steer(45);
        eType.accelerate(30);
        eType.accelerate(20);
        eType.accelerate(-42);

    }
}
