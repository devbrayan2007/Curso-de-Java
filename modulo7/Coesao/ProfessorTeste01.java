package modulo7.Coesao;

import modulo7.Classes.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Thiago";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " + professor.idade + ", " + professor.sexo);
    }
}
