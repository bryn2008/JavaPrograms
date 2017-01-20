package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animial", 1, 1, 5, 5);

        Dog dog = new Dog("Yoekie", 8, 20, 2, 4, 1, 20, "long silky" );
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
