package exercicios;

public class ex026 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 3;
        array[0][1] = 2;
        array[0][2] = 10;

        array[1][0]= 7;
        array[1][1] = 0;
        array[1][2] = 8;

        array[2][0] = 9;
        array[2][1] = 24;
        array[2][2] = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               System.out.println(array[i][j]);
            }
        }
    }
}
