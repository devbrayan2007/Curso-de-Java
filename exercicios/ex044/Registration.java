package exercicios.ex044;

public class Registration {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank("Avenida das Américas", 1234, "2617-170", 718291010);

        customer.customerLogin();
    }
}
