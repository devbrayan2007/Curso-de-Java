package modulo6;

public class ArraysMultidimensionais1 {
    public static void main(String[] args) {

      // Introdução aos Arrays Multidimensionais
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 10;
        dias[1][1] = 15;
        dias[1][2] = 20;

        dias[2][0] = 5;
        dias[2][1] = 4;
        dias[2][2] = 2;

        for (int i = 0; i < dias.length; i++) {
           for (int j = 0; j < dias[i].length; j++) {
             System.out.println(dias[i][j]);
           }
        }
    
    }
}
