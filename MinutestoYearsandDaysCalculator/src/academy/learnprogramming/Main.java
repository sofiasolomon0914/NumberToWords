package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {


            long years = minutes / 525600;
            long daysRemaining = (minutes % 525600)/1440;

            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");

        }
    }
}
