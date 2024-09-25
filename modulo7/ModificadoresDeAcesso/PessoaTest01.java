package modulo7.ModificadoresDeAcesso;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Brayan");
        pessoa.setIdade(17);
        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
