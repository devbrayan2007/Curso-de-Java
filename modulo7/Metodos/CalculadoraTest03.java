package modulo7.Metodos;

import modulo7.Classes.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        double result2 = calculadora.divideDoisNumeros2(20,2);
        System.out.println(result);
        System.out.println("-------------------");
        System.out.println(result2);
        System.out.println("-------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,5);
    }
}
