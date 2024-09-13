package modulo3;

public class EstruturasCondicionais4 {
    public static void main(String[] args) {
        // Operador Ternário
        double salario = 680;
        String mensagemDoar = "Eu vou doar R$500";
        String mensagemNaoDoar = "Ainda não tenho condições :(";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
