package modulo7.Testes;

import modulo7.Classes.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        /** Registro do Estudante 1*/
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("------------------");


        /**Registro do Estudante 2*/
        estudante2.nome = "Lucas";
        estudante2.idade = 29;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
