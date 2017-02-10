package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Bryn";
//        player.health = 20;
//        player.weapon = "Gun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Bryn", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
