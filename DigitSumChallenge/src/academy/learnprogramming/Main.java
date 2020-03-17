package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
    }
    public static int sumDigits(int number){
//        if(number>= 10){
//            int numOne = number % 10;
//            number = number/10;
//            int numTwo = number % 10;
//            number = number / 10;
//            int numThree = number % 10;
//
//            int sumNum = numOne + numTwo + numThree;
//            System.out.println("The sum of the digits is " + sumNum);
//            return sumNum;
//        }
//        return -1;

        if(number < 10){
            return -1;
        }

        int sum = 0;
        while(number>0){
            //extract least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10;   // number = number / 10
        }

        return sum;
    }
}
