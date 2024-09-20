package exercicios;

import java.util.Random;

public class ex027 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int[][] numbers = new int[4][4];
        int sum_arrays = 0;

       numbers[0][0] = randomGenerator.nextInt(100);
       numbers[0][1] = randomGenerator.nextInt(100);
       numbers[0][2] = randomGenerator.nextInt(100);
       numbers[0][3] = randomGenerator.nextInt(100);

       numbers[1][0] = randomGenerator.nextInt(100);
       numbers[1][1] = randomGenerator.nextInt(100);
       numbers[1][2] = randomGenerator.nextInt(100);
       numbers[1][3] = randomGenerator.nextInt(100);

       numbers[2][0] = randomGenerator.nextInt(100);
       numbers[2][1] = randomGenerator.nextInt(100);
       numbers[2][2] = randomGenerator.nextInt(100);
       numbers[2][3] = randomGenerator.nextInt(100);
       
       numbers[3][0] = randomGenerator.nextInt(100);
       numbers[3][1] = randomGenerator.nextInt(100);
       numbers[3][2] = randomGenerator.nextInt(100);
       numbers[3][3] = randomGenerator.nextInt(100);



       for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
               System.out.println(numbers[i][j]);
               sum_arrays += numbers[i][j];
            }
       }
       System.out.println("Soma de todos os elementos: " + sum_arrays);
    }
}
