package modulo7.Metodos;


import modulo7.Classes.Estudante2;
import modulo7.Classes.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante2 estudante1 = new Estudante2();
        Estudante2 estudante2 = new Estudante2();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.corLinha();

        estudante1.nome = "Brayan";
        estudante1.idade = 17;
        estudante1.sexo = 'M';

        impressora.imprime(estudante1);

        impressora.mostrarLinha();

        estudante2.nome = "Ester";
        estudante2.idade = 15;
        estudante2.sexo = 'F';

        impressora.imprime(estudante2);

        impressora.mostrarLinha();

        impressora.imprime(estudante1);



    }
}
