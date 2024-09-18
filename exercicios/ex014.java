package exercicios;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;

        System.out.print("Enter a number: ");
        count = input.nextInt();
        System.out.println("____________________");

        for (int i = 1; i < count; i++) {
            System.out.println(i);
        }
    }   
}
