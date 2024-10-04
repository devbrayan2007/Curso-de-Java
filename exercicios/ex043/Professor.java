package exercicios.ex043;

public class Professor {
        private String teacherName;
        private String teacherSpecialty;
        private Seminario[] seminars;

        public Professor(String teacherName) {
            this.teacherName = teacherName;
        }

        public Professor(String teacherName, String teacherSpecialty) {
            this.teacherName = teacherName;
            this.teacherSpecialty = teacherSpecialty;
        }

        public Professor(String teacherName, String teacherSpecialty, Seminario[] seminars) {
            this.teacherName = teacherName;
            this.teacherSpecialty = teacherSpecialty;
            this.seminars = seminars;
        }

        public void printReport() {
            System.out.println("-------------");
            System.out.println("Professor: " + this.teacherName);
            if (this.seminars == null) return;
            System.out.println("## Seminários Cadastrados ##");
                for (Seminario seminar : this.seminars) {
                    System.out.println(seminar.getTitleName());
                    System.out.println(seminar.getLocation().getAddress());
                    if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
                    System.out.println("** Alunos **");
                    for (Aluno student : seminar.getStudents()) {
                        System.out.println("Aluno: " + student.getStudentName() + " Idade: " + student.getStudentAge());
                    }
                }
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherSpecialty(String teacherSpecialty) {
            this.teacherSpecialty = teacherSpecialty;
        }

        public String getTeacherSpecialty() {
            return teacherSpecialty;
        }

        public void setSeminars(Seminario[] seminars) {
            this.seminars = seminars;
        }

        public Seminario[] getSeminars() {
            return seminars;
        }
}
