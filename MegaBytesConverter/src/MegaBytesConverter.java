public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = Math.round(kiloBytes / 1024);
        long megaBytesRemainder = kiloBytes % 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "
                    + megaBytesRemainder + " KB");
        }

    }



}