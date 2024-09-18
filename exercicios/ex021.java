package exercicios;
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrays = new int[6];

        for (int i = 1; i < arrays.length; i++) {
            System.out.println("\033[1;34mPosição " + i + ": ");
            arrays[i] = input.nextInt();
        }

        System.out.println("\033[1;32mPOSIÇÕES REGISTRADAS!");
        System.out.println("\033[1;33mA primeira posição registrada foi: " + arrays[1]);
        System.out.println("\033[1;35mA última posição registrada foi: " + arrays[5]);
    }
}
