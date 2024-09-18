package exercicios;
import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Informe o " + i  + "° valor: ");
            numbers[i] = input.nextInt();
        }
        // Modifying the element[number] in position 2
        System.out.println("Digite o novo valor para a posição 2: ");
        numbers[2] = input.nextInt();
        System.out.println("Número adicionado: " + numbers[2]);
    } 
}
