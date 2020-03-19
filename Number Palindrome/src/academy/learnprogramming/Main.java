package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	isPalindrome(101);
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int startingNumber = number;

        while(number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number/10;

            if(startingNumber == reverse){
                System.out.println("It is a Palindrome.");
                return true;
            }

        }
        return false;
    }
}
