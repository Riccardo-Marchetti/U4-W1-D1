import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
            String stringa1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
            String stringa2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
            String stringa3 = scanner.nextLine();
        System.out.println("Ecco la stringa : " + concatOfString(stringa1, stringa2, stringa3));
            scanner.close();
    }
    public static String concatOfString(String stringa1, String stringa2, String stringa3) {
       return "" + (stringa1 + " " + stringa2 + " "  + stringa3);
    }
}
