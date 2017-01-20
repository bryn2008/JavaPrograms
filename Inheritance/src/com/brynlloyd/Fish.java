package com.brynlloyd;

/**
 * Created by bryn.lloyd on 20/01/2017.
 */
public class Fish extends Animal {

    private int gilles;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gilles, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gilles = gilles;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }

}
