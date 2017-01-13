package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        hightScore = calculateScore(gameOver, 10000, levelCompleted , bonus);
        System.out.println("Your final score was " + hightScore);

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Bryn", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Carol", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Louise", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into highScorePosition "
                + highScorePosition + " on the High Score Table");
    }

    public static int calculateHighScorePosition(int highScore) {

        if (highScore >= 1000){
            return 1;
        } else if(highScore >= 500 && highScore < 1000){
            return 2;
        } else if(highScore >= 100 && highScore < 500){
            return 3;
        }
        return 4;
    }
}
