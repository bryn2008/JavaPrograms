package com.brynlloyd;

/**
 * Created by bryn.lloyd on 10/02/2017.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return this.hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
