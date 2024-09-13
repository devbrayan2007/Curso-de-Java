package exercicios;

public class ex007 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712){
            salarioAnual *= primeiraFaixa;
            
        } else if (salarioAnual >= 3413 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }
        System.out.println(salarioAnual);

    }
}
