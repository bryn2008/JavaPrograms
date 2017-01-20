package com.brynlloyd;

/**
 * Created by bryn.lloyd on 20/01/2017.
 */
public class Car {

    // State of the car
    private int doors;
    private int wheelsc;
    private String model;
    private String Engine;
    private String colour;

    public void setModel(String model){
        String validModle = model.toLowerCase();
        if(validModle.equals("carrera") || validModle.equals("comodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
