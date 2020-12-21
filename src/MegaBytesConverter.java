public class MegaBytesConverter {
    public static void megaandkiloBytes(int kiloBytes){

        if(kiloBytes<0){

            System.out.println("Invalid value");
            int tomega=(kiloBytes % 1024);
            int kilo=tomega;
            int mega=kiloBytes / 1024;

            System.out.print(kiloBytes+"KB" +mega+"MB"+ "and" + kilo+ "KB");
        }
    }
}
