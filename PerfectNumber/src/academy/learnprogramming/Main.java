package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int factor = 1;
        int factorSum = 0;

        while(factor < number){
            if(number % factor == 0){
                factorSum += factor;
            }
            factor += 1;
        }

        if(factorSum == number){
            System.out.println("This is a perfect number!");
            return true;
        }
        return false;
    }
}
