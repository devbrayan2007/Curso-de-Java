package exercicios;
import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
       

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Número " + i + ": ");
            numbers[i] = input.nextInt();
            if (numbers[i] > 10) {
                System.out.println("VALOR ENCONTRADO!");
                break;
            } else {
                System.out.println("VALOR NÃO ENCONTRADO!");
            }
    }
  } 
}
