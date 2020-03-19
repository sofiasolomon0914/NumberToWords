package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	printFactors(6);
    }

    public static int printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return -1;
        }
        int factorCheck = 1;
        while(factorCheck <= number){
            if(number % factorCheck == 0){
                System.out.println(factorCheck);
            }
            factorCheck += 1;
        }
        return -1;
    }

}
