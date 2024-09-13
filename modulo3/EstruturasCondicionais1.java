package modulo3;

public class EstruturasCondicionais1 {
    public static void main(String[] args) {
        // USO DO IF
        if (true){
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");

        int idade = 17;
        boolean isAutorizacao = idade >= 18;
        if (isAutorizacao){
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }
        if (!isAutorizacao){
            System.out.println("Não autorizado!");
        }
    }
}
