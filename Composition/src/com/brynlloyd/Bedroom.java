package com.brynlloyd;

/**
 * Created by bryn.lloyd on 10/02/2017.
 */
public class Bedroom {
    private String name;
    private Wall wallOne;
    private Wall wallTwo;
    private Wall wallThree;
    private Wall wallFour;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wallOne, Wall wallTwo, Wall wallThree, Wall wallFour, Celling celling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wallOne = wallOne;
        this.wallTwo = wallTwo;
        this.wallThree = wallThree;
        this.wallFour = wallFour;
        this.celling = celling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }

}
