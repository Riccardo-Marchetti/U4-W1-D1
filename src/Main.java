import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        moltiplica(3, 6);
        concatena("Il numero è : ", 5);

       String[] a = {"ciao", "a", "ragazzi", "sono", "riccardo"};
        inserisciInArray(a, "tutti");
    }
    public static void moltiplica(int multiplication1, int multiplication2) {
         System.out.println("La moltiplicazione di questi due numeri è : " +  (multiplication1 * multiplication2));
    }
    public static void concatena(String stringa, int number1) {
        System.out.println("" + (stringa + number1));
    }

    public static void inserisciInArray(String[] array, String stringa) {
        String[] arrayOfStrings = new String[6];

        for (int i = 0; i < 2 ; i++) {
            arrayOfStrings[i] = array[i];
        }
        arrayOfStrings[2] = stringa;
        for (int i = 3; i < arrayOfStrings.length; i++) {
            arrayOfStrings[i] = array[i - 1];
        }
        System.out.println(Arrays.toString(arrayOfStrings));
    }
}