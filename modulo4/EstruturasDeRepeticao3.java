package modulo4;

public class EstruturasDeRepeticao3 {
    public static void main(String[] args) {
        // USO DO CONTINUE
        double valorTotal = 3000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela  + " R$" + valorParcela);
        }
    }
}
