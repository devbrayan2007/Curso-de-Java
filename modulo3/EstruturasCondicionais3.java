package modulo3;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        // USO DO ELSE IF
        int idade = 19;

        if (idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulta");
        }
    }
}
