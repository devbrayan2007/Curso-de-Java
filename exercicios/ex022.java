package exercicios;
import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[6];
        

        for (int i = 1; i < ages.length; i++) {
            System.out.println("Idade da pessoa " + i + ": ");
            ages[i] = input.nextInt();
        }
        int sum_ages = ages[0] + ages[1] + ages[2] + ages[3] + ages[4] + ages[5];
        System.out.println("A soma de todas as idades foi: " + sum_ages);
    }
}
