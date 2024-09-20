package modulo7.Testes;

import modulo7.Classes.Estudante;

public class EstudanteTeste01 {
    // Introdução a Classes - Orientação a Objetos - pt.1
    public static void main(String[] args) {
        Estudante pessoa = new Estudante();
        pessoa.nome = "Brayan";
        pessoa.idade = 17;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

        


    }
}
