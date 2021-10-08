package com.challenge;

public class HighScorePosition {

    public static void main(String[] args) {

        int highScore = calculateScore(true,800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePostion("Pawel", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePostion("Dima", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePostion("Olena", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePostion("Kornel", highScorePosition);
    }
    public static void displayHighScorePostion(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get position " + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
