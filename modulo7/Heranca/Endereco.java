package modulo7.Heranca;

public class Endereco {
    private String rua;
    private String cep;


    public Endereco(String rua) {
        this.rua = rua;
    }

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
}
