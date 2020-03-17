package academy.learnprogramming;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count !=6){
            System.out.println("Count value is " + count);
            count++;
        }

//        for(int i=1; i<7; i++){
//            System.out.println("Count value is " + i);
//        }

        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do{
            System.out.println("Count value is " + count);
            count++;
        }while(count != 6);
        //this form [do while] while ALWAYS execute at least once
//
//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            evenNumbersFound++;
            if(evenNumbersFound==6){
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = "+ evenNumbersFound);

    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
