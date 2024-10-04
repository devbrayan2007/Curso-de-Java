package modulo7.Associacao;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Vinicius");
        Professor professor2 = new Professor("João Paulo");
        Professor professor3 = new Professor("Thiago Valentim");
        Professor[] professores = {professor1,professor2, professor3};
        Escola escola = new Escola("CIEP 367", professores);

        escola.imprime();
    }
}
