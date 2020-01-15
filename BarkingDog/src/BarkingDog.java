public class BarkingDog {

    public static void shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking){
            if(hourOfDay > 0 && hourOfDay < 8){
                System.out.println("true");
            } else if(hourOfDay == 23){
                System.out.println("true");
            } else {
                System.out.println("false");
            }


        } else {
            System.out.println("false");
        }
    }
}
