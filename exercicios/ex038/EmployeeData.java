package exercicios.ex038;


public class EmployeeData {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Brayan");
        employee.setAge(17);
        employee.setWages( new double[]{1200, 1780, 2000});

        employee.PrintData();
        employee.showLine();
        employee.AverageSalary();
        System.out.println("Average: " + employee.getAverage());

    }
}
