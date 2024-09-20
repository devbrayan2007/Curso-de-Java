package exercicios.ex029;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        /** Car Registration 1*/
        car1.mark = "Dodge";
        car1.model = "Challenger";
        car1.year = 2021;

        /** Car Registration 2*/
        car2.mark = "FIAT";
        car2.model = "Siena";
        car2.year = 2020;

        System.out.println(car1.mark);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("------------");

        System.out.println(car2.mark);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
