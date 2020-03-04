package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char switchLetter = 'E';

        switch(switchLetter){
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C': case 'D': case'E':
                System.out.println("Letter was "+switchLetter);
                break;

            default:
                System.out.println("Letter was not A, B, C, D, or E");
                    break;
        }
    }
}
