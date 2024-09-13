package exercicios;

public class ex006 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 30;
        int num3 = 10;

        if (num1 > num2 && num1 > num3){
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é: " + num3);
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}
