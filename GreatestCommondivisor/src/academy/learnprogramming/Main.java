package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10)||(second < 10)){
            return -1;
        }
        int greatestCommonDivisor = 1;
        for(int i = 1; i <= first && i <= second; i++){
            if(first % i == 0 && second % i == 0){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;

    }

}
