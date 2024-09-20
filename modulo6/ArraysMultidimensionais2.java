package modulo6;

public class ArraysMultidimensionais2 {
    public static void main(String[] args) {

        // Uso do Foreach
        
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

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
