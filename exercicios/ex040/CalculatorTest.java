package exercicios.ex040;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        // SUM
        int result = calculator.sumNumbers(2,2);
        System.out.println(result);

        calculator.showLines();

        // SUBTRACT
        result = calculator.subctractNumbers(3,2);
        System.out.println(result);

        calculator.showLines();

        // MULTIPLICATION
        result = calculator.multiplicationNumbers(9,9);
        System.out.println(result);

        calculator.showLines();

        // DIVISION
        result = calculator.divisionNumbers(4,2);
        System.out.println(result);
    }
}
