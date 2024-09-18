package exercicios;
import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < array.length; i++) {
            System.out.println("Valor " + i + ": ");
            array[i] = input.nextInt();
        }
        int sum_array = array[1] + array[2];
        System.out.println("A soma entre os dois primeiros elementos do Array são: " + sum_array);

    
    }
}
