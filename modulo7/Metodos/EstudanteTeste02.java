package modulo7.Metodos;

import modulo7.Classes.Estudante2;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante2 estudante1 = new Estudante2();
        Estudante2 estudante2 = new Estudante2();

        estudante1.nome = "Brayan";
        estudante1.idade = 17;
        estudante1.sexo = 'M';

        estudante2.nome = "João";
        estudante2.idade = 29;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}
