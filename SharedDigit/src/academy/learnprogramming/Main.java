package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

//    public static boolean hasSharedDigit(int numOne, int numTwo) {
//        if ((numOne >= 10) && (numOne <= 99) && (numTwo >= 10) && (numTwo <= 99)) {
//
//            int numOneFirst = numOne % 10;
//            numOne /= 10;
//            int numOneLast = numOne % 10;
//
//            int numTwoFirst = numTwo % 10;
//            numTwo /= 10;
//            int numTwoLast = numTwo % 10;
//
//            return (numOneFirst == numTwoFirst) || (numOneFirst == numTwoLast) || (numOneLast == numOneFirst) ||
//                    (numOneLast == numTwoLast);
//        }
//        return false;
//    }

    public static boolean hasSharedDigit(int num1,int num2) {
        if(num1<10||num2<10||num1>99||num2>99) {
            return false;
        }while(num1!=0 && num2!=0) {
            int digit1 = num1%10;
            int digit2 = num2%10;
            num1/=10;
            num2/=10;
            if((digit1==digit2)||(digit1==num2)||(digit2==num1)) {
                return true;
            }
        }return false;
    }

}