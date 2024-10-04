package exercicios.ex043;

public class Aluno {
        private String studentName;
        private int studentAge;
        private Seminario seminars;


        public Aluno(String studentName, int studentAge) {
            this.studentName = studentName;
            this.studentAge = studentAge;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setSeminars(Seminario seminars) {
            this.seminars = seminars;
        }

        public Seminario getSeminars() {
            return seminars;
        }
}
