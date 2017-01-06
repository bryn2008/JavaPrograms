package com.brynlloyd;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // code blocks are used for readability
//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }else if(score < 1000){
//            System.out.println("Your Score was les than 1000");
//        } else {
//            System.out.println("Got here");
//        }


        /*this test block of code is called scope,
          the variable is intialised inside the code block
          and so it can not be accessed outside if the code block
        */

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }














    }
}
