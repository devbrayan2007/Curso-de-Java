package exercicios;
import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrays = {1,2,3,4,5};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Posição " + i + ": ");
            arrays[i] = input.nextInt();
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Posição " + i + ": " + arrays[i]);
        }
    
    }
}
