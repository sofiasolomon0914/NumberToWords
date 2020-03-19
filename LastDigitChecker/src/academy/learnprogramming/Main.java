package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){

        if(!isValid(numOne)||(!isValid(numTwo))||(!isValid(numThree))) {
            return false;
        } else{
            int lastDigitOne = numOne % 10;
            int lastDigitTwo = numTwo % 10;
            int lastDigitThree = numThree % 10;

            return (lastDigitOne == lastDigitTwo)||(lastDigitOne == lastDigitThree)||(lastDigitTwo == lastDigitThree);

        }

    }

    public static boolean isValid(int number){
        return (number >= 10)&&(number <= 1000);
    }

}
