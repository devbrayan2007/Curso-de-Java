package modulo7.Classes;

public class Calculadora {
    /** Métodos*/
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 2);
    }

    /** Parâmetros */
    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    /** Retorno */
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.err.println("NÃO EXISTE DIVISÃO POR ZERO");
            return;
        }
            System.out.println(num1 / num2);
    }

    /** Parâmetros tipo primitivo */
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    /** Varags*/
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num; // 1 + 2 + 3 = 5
        }
        System.out.println(soma); // 5
    }

}
