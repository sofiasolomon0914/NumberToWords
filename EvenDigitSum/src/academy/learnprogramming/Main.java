package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	getEvenDigitSum(123456789);
    }
    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            number /= 10;
            if(digit % 2 == 0){
                sum += digit;
            }
        }
        System.out.println("Sum of even digits is " + sum);
        return sum;
    }
}
