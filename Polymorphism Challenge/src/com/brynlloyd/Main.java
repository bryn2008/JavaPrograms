package com.brynlloyd;

class Car{
    private boolean engine;
    private int cylenders;
    private String name;
    private int wheels;

    public Car(int cylenders, String name) {
        this.name = name;
        this.engine = true;
        this.cylenders = cylenders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylenders() {
        return cylenders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> break";
    }
}

class Mitsubushi extends Car {
    public Mitsubushi(int cylenders) {
        super(cylenders, "Mitsubushi");
    }

    @Override
    public String startEngine() {
        return "Mitsubushi -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Mitsubushi -> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubushi -> brake";
    }
}

class Jaguar extends Car{
    public Jaguar(){
        super(16, "Jaguar");
    }

    @Override
    public String startEngine() {
        return "Engine roars!";
    }

    @Override
    public String accelerate() {
        return "Mind blowingly fast!!!!!";
    }
}

class Polo extends Car{
    public Polo(){
        super(4, "Polo");
    }

    @Override
    public String startEngine() {
        return "Engine hummmms amazingly!";
    }

    @Override
    public String accelerate() {
        return "A bit slow, just over 16 seconds for 0 - 60";
    }
}

class Leon extends Car{
    public Leon(){
        super(16, "Leon");
    }

    @Override
    public String startEngine() {
        return "Engine purrs!";
    }

    @Override
    public String accelerate() {
        return "A nippy little thing 0 - 60 in around 10 seconds";
    }
}

class RustBucket extends Car{
    public RustBucket(){
        super(0, "Rust Bucket");
    }

    // No startEngine Method

    @Override
    public String accelerate() {
        return "This thing is going no where without an engine";
    }

}

class Holden extends Car {

    public Holden(int cylenders) {
        super(cylenders, "Holden");
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate";
    }

    @Override
    public String brake() {
        return "Holden -> brake";
    }
}

class Ford extends Car {

    public Ford(int cylenders) {
        super(cylenders, "Ford");
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(0 , "some car");
        System.out.println(car1.accelerate());
        System.out.println(car1.startEngine());
        System.out.println(car1.brake());

        Mitsubushi mitsubushi = new Mitsubushi(0);
        System.out.println(mitsubushi.accelerate());
        System.out.println(mitsubushi.startEngine());
        System.out.println(mitsubushi.brake());

        Ford ford = new Ford(0);
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());

        Holden holden = new Holden(18);
        System.out.println(holden.accelerate());
        System.out.println(holden.startEngine());
        System.out.println(holden.brake());

        System.out.println("\n");

        for(int i=1; i<11; i++){
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Start engine: " + car.startEngine() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" +
                    "Break: " + car.brake() + "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 5 ) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaguar();
            case 2:
                return new Polo();
            case 3:
                return new Leon();
            case 4:
                return new RustBucket();
            case 5:
                return new Mitsubushi(4);
        }
        return null;
    }

}
