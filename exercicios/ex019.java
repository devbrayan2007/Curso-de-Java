package exercicios;
import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        String[] arrayCity = new String[4];

        for (int i = 1; i < arrayCity.length; i++) {
            System.out.println("Digite o nome da cidade " + i + ": ");
            arrayCity[i] = input.nextLine();
        }

            System.out.println("Cidades registradas: ");
            for (String city : arrayCity) {
                System.out.println(city);
           }
        }
    }
    