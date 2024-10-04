package exercicios.ex043;

public class Seminario {
    private String titleName;
    private Aluno[] students;
    private Local location;

    public Seminario(String titleName, Local location) {
        this.titleName = titleName;
        this.location = location;
    }

    public Seminario(String titleName, Aluno[] students) {
        this.titleName = titleName;
        this.students = students;
    }

    public Seminario(String titleName, Aluno[] students,Local location) {
        this.titleName = titleName;
        this.students = students;
        this.location = location;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setStudents(Aluno[] students) {
        this.students = students;
    }

    public Aluno[] getStudents() {
        return students;
    }

    public void setLocation(Local location) {
        this.location = location;
    }

    public Local getLocation() {
        return location;
    }
}
