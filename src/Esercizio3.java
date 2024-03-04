import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del primo lato del rettangolo");
        double lato1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo");
        double lato2 = Double.parseDouble(scanner.nextLine());
        System.out.println("il perimetro è : " + perimetroRettangolo(lato1, lato2));

        System.out.println("Inserisci un numero");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Il numero è : " + pariDispari(number1));

        System.out.println("Inserisci la lunghezza del primo lato del triangolo");
        double latoTriangolo1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo");
        double latoTriangolo2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo");
        double latoTriangolo3 = Double.parseDouble(scanner.nextLine());
        double area = perimetroTriangolo(latoTriangolo1, latoTriangolo2, latoTriangolo3);
        System.out.println("L'area del triangolo è: " + area);
        scanner.close();
    }
    public static double perimetroRettangolo(double lato1, double lato2) {
        return (lato1 * 2) + (lato2 * 2);
    }
    public static int pariDispari(int number1) {
        if( number1 %  2 == 0 ) {
            return 0;
        } else {
            return 1;
        }
    }
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro =  (lato1 + lato2 + lato3) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
        return area;
    }
}
