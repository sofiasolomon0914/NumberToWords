public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){

        int intNumOne = (int) (numOne * 1000);
        int intNumTwo = (int) (numTwo * 1000);

        return intNumOne == intNumTwo;

    }



}
