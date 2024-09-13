package modulo4;

public class EstruturasDeRepeticao1 {
    public static void main(String[] args) {
        // while
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }

        System.out.println("_________________________");

        // do while
        do{
            System.out.println("Dentro do do-while");
        }while (count < 10);

        System.out.println("_______________________");

        // for
        for(int i = 0; i < 10; i++){
            System.out.println("For " + i);
        }
    }
}
