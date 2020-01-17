package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0){
            return -1;
        } else {
            double totalCentimeters = ((feet * 12) + inches) / 2.54;
            return (int) totalCentimeters;
        }
    }

    public static int calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0 ) {
            return -1;
        } else {
            double inchesToFeet = (inches/12);
            return (int) inchesToFeet;
        }
    }

}