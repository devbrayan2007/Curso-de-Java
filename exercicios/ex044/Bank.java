package exercicios.ex044;

public class Bank {
    private String streetBank;
    private int numberBank;
    private String cepBank;
    private int agencyBank;
    private Customer[] customers;


    public Bank(String streeBank, int numberBank, String cepBank, int agencyBank) {
        this.streetBank = streeBank;
        this.numberBank = numberBank;
        this.cepBank = cepBank;
        this.agencyBank = agencyBank;
    }
}
