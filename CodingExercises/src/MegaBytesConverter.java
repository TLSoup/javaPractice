public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(7042);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

}