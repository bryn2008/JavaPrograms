package com.brynlloyd;

/**
 * Created by bryn.lloyd on 10/02/2017.
 */
public class Lamp {
    private String style;
    private Boolean battery;
    private int globRating;

    public Lamp(String style, Boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Turning on");
    }

    public String getStyle() {
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
