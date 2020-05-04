public class Main {

    public static void main(String[] args) {
        numberToWords(24);
        getDigitCount(24);
    }
    public static String numberToWords(int number){


        if(number < 0){
            System.out.println("Invalid Value");
        }


        while(number > 0){

            int numberRemainder = number % 10;
            number /= 10;


            switch (numberRemainder){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println(("Two"));
                    break;
                case 3:
                    System.out.println(("Three"));
                    break;
                case 4:
                    System.out.println(("Four"));
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println(("Six"));
                    break;
                case 7:
                    System.out.println(("Seven"));
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }


        } return "Complete";

    }

    public static int reverse(int number){
        return number = reverse(number);

    }


    public static int getDigitCount(int number){
        if(number < 0) {
            return -1;
        }

        int count = 0;

        while(number > 0) {
            number /= 10;
            count ++;

        }
        return count;

    }

}
