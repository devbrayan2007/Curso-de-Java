package exercicios.ex040;

public class Calculator {
    public int num1;
    public int num2;


    public int sumNumbers(int num1, int num2) {
        int sum = num1 + num2;
       if (sum == 0) {
           System.err.println("Null result");
       }
        return sum;
    }

    public int subctractNumbers(int num1, int num2) {
        int subtract = num1 - num2;
        if (subtract == 0) {
            System.err.println("Null result");
        }
        return subtract;
    }

    public void showLines() {
        System.out.println("*************************");
    }

    public int multiplicationNumbers(int num1, int num2) {
        int multiplication = num1 * num2;
        if (multiplication == 0) {
            System.err.println("Null result");
        }
        return multiplication;
    }

    public int divisionNumbers(int num1, int num2) {
        int division = num1 / num2;
        if (division == 0) {
            System.err.println("Null result");
        }
        return division;
    }
}
