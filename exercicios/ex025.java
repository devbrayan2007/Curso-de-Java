package exercicios;
import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[4];

        for (int p = 1; p < names.length; p++) {
            System.out.print("Digite o nome da " + p + "° pessoa: ");
            names[p] = input.nextLine();
        }

        // Modifying the element[name] in position 2
        System.out.print("Registre outro nome no elemento 2: ");
        names[2] = input.nextLine();
        for (String n : names) {
            System.out.println(n);
        }
    }
}
