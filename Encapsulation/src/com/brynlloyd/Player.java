package com.brynlloyd;

/**
 * Created by bryn.lloyd on 10/02/2017.
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // reduce the No. of lifes for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
