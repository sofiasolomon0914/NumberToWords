package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 4000;
	int levelCompleted = 5;
	int bonus = 100;

//	if(score < 5000 && score > 1000) {
//		System.out.println("Your score was 5000 but greater than 1000");
//	} else if(score < 100){
//			System.out.println("Your score was less than 1000");
//	}else {
//		System.out.println("Got here");
//
//	}

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		// Print out a second score on the screen with the following
		// score set to 1000
		// levelCompleted set to 8
		// bonus set to 200
		// But make sure the first printout above still displays as well

	boolean gameOverTwo = true;
	int scoreTwo = 1000;
	int levelCompletedTwo = 8;
	int bonusTwo = 200;

		if (gameOverTwo) {
			int finalScoreTwo = scoreTwo + (levelCompletedTwo * bonusTwo);
			System.out.println("Your final score was " + finalScoreTwo);
		}


    }


}
