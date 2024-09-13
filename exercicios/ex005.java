package exercicios;

public class ex005 {
    public static void main(String[] args) {

        double nota = 4.5;

        if (nota >= 9 && nota <= 10){
            System.out.println("CONCEITO A");
        }
        else if (nota >= 7 && nota <= 8) {
            System.out.println("CONCEITO B");
        }
        else if (nota >= 5 && nota <= 6) {
            System.out.println("CONCEITO C");
        }
        else if (nota >= 3 && nota <= 4) {
            System.out.println("CONCEITO D");
        }
        else if (nota >= 0 && nota <= 2) {
            System.out.println("CONCEITO E");
        }
    }
}
