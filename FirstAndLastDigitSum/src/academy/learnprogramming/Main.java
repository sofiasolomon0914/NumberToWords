package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else {
            int firstDigit = 0;
            int lastDigit = number % 10;

            while (number > 0) {
                firstDigit = number % 10;
                number = number / 10;
            } return lastDigit + firstDigit;
        }
    }
}
