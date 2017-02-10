package com.brynlloyd;

/**
 * Created by bryn.lloyd on 10/02/2017.
 */
public class Case {
    private String model;
    private String manufacture;
    private String powerSuply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSuply, Dimensions dimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSuply = powerSuply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
