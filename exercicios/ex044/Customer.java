package exercicios.ex044;
import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);
    private String nameCustomer;
    private String passwordCustomer;
    private Bank bank;


    public void customerLogin() {
        System.out.print("Informe seu nome de usuário: ");
        this.nameCustomer = input.nextLine();

        System.out.print("Informe sua senha: ");
        this.passwordCustomer = input.nextLine();

        if (this.nameCustomer.equals("Brayan") && this.passwordCustomer.equals("301221")) {
            System.out.println("Bem-vindo de volta, " + nameCustomer + "!");
        } else {
            System.err.println("Nome de usuário ou senha incorretos!");
            return;
        }
    }


    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }
}
