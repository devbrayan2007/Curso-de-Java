package exercicios;
import java.util.Scanner;
import java.util.Random;

public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        int option;
        int sum_odds = 1 ;
        int pc_result = randomGenerator.nextInt(100) + 1;

        System.out.println("-----------------");
        System.out.println("LET'S PLAY!");
        System.out.println("-----------------");

        System.out.println("Choose a number from 1 to 100: ");
        option = input.nextInt();

        while (option != pc_result) {
            System.out.println("ERRO! Try again: ");
            option = input.nextInt();
            sum_odds++;
        }

        System.out.println("YOU WIN! ");
        System.out.println("Suas tentativas: " + sum_odds);
       
        
    }
}
