package exercicios;

public class ex015 {
    public static void main(String[] args) {
       int count = 1;
       int soma_num = 0;

       while (count <= 100) {
           soma_num += count;
           count++;
       }
       System.out.println("A soma total foi de " + soma_num);
    }
}
