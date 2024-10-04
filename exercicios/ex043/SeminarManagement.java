package exercicios.ex043;

public class SeminarManagement {
    public static void main(String[] args) {
            Local location = new Local("Rua das Laranjeiras");
            Aluno student = new Aluno("Brayan", 17);
            Professor teacher = new Professor("João Paulo", "Matemática");
            Aluno[] studentsForSeminar  = {student};
            Seminario seminar = new Seminario("Fundamentos de Hardware", studentsForSeminar, location);

            Seminario[] availableSeminars = {seminar};


            teacher.setSeminars(availableSeminars);
            teacher.printReport();

    }
}
