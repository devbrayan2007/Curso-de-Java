package exercicios.ex041;
import java.util.Scanner;
import java.lang.Math;


public class ConverterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Converter converter = new Converter();

        char option;
        int convertOption;


        System.out.println("\033[1;34mCurrency Conversion Program");
        System.out.println("\033[1;36m-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\033[1;32mCURRENCY MENU");
        System.out.println("d - Dollar");
        System.out.println("e - Euro");
        System.out.println("r - Real");
        System.out.println("Any other key to exit the program");


        System.out.println("\033[1;36m-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            System.out.print("\033[1;35mChoose your base currency: ");
            option = input.nextLine().charAt(0);

            if (option == 'd') {
                System.out.print("\033[1;33mEnter a value: US$");
                converter.value = input.nextDouble();

                System.out.print("\033[1;32mWich currency do you want to convert this amount to? (1 - real, 2 - euro) ");
                convertOption = input.nextInt();

                if (convertOption == 1) {
                    double result = converter.ConvertToDollar();
                    System.out.println(Math.round(result));
                } else if (convertOption == 2) {
                        double result = converter.ConvertToEuro();
                    System.out.println(result);
                } else if (convertOption == 3){
                    System.out.println("\033[1;31mFinishing program...");
                } else {
                    System.err.println("Invalid option!");
                }
            } else if (option == 'e') {
                System.out.print("\033[1;33mEnter a value: €");
                converter.value = input.nextDouble();

                System.out.print("\033[1;32mWich currency do you want to convert this amount to? (1 - real, 2 - dollar, 3 - Cancel) ");
                convertOption = input.nextInt();

                if (convertOption == 1) {
                    double result = converter.ConvertToDollar();
                    System.out.println(result);
                } else if (convertOption == 2) {
                    double result = converter.ConvertToDollar();
                    System.out.println(result);
                } else if (convertOption == 3){
                    System.out.println("\033[1;31mFinishing program...");
                } else {
                    System.err.println("Invalid option!");

                }

            } else if (option == 'r') {
                System.out.print("\033[1;33mEnter a value: R$");
                converter.value = input.nextDouble();

                System.out.print("\033[1;32mWich currency do you want to convert this amount to? (1 - euro, 2 - dollar, 3 - Cancel) ");
                convertOption = input.nextInt();

                if (convertOption == 1) {
                    double result = converter.ConvertToEuro();
                    System.out.println(result);
                } else if (convertOption == 2) {
                    double result = converter.ConvertToDollar();
                    System.out.println(result);
                } else if (convertOption == 3) {
                    System.out.println("\033[1;31mFinishing program...");
                } else {
                    System.err.println("Invalid option!");
                }
            } else {
                System.out.println("\033[1;32mThank you for using our system, come back often! :) ");
            }
        }
    }