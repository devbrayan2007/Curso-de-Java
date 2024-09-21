package modulo7.Classes;

public class ImpressoraEstudante {
    public void imprime(Estudante2 estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Pedro";
    }

    public void mostrarLinha() {
        System.out.println("\033[1;33m-------------------------------");
        System.out.println("\033[1;32m");
    }

    public void corLinha() {
        System.out.println("\033[1;36m");
    }
}
