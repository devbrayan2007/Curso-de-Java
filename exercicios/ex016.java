package exercicios;
import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_number = 0;
        int number = 1;

        while (number > 0) {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            sum_number += number;
            number++;
        }
        System.out.println("The sum of the numbers was " + sum_number);
    }
}
