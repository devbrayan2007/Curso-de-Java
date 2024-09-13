package modulo3;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        // USO DO ELSE

        int idade = 18;
        boolean isAutorizacao = idade >= 18;

        if (isAutorizacao){
            System.out.println("Autorizado!");
        }else {
            System.out.println("Não autorizado!");
        }
    }
}
