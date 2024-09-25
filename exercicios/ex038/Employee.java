package exercicios.ex038;

public class Employee {
    private String name;
    private int age;
    private double[] wages;
    private double average = 0;


    public void PrintData() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
       if (wages == null) {
           return;
       }
            for (double wage : wages) {
                System.out.print(wage + " ");
                System.out.println();
        }

    }

    public void showLine() {
        System.out.println("--------------------");
    }

    public void AverageSalary() {
        if (wages == null) {
            return;
        }

        double average = 0;
            for (double wage : wages) {
                average += wage;
            }

        average /= wages.length;
        System.out.println("Average Salary: US$" + average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWages(double[] wages) {
        this.wages = wages;
    }

    public double[] getWages() {
        return this.wages;
    }

    public double getAverage() {
        return this.average;

    }
}


