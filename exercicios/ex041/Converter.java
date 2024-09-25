package exercicios.ex041;

public class Converter {
    public double value;

    public double ConvertToReal() {
        double converter = value * 0.18;
        return converter;
    }

    public double ConvertToEuro() {
        double converter = value * 6.16;
        return converter;
    }

    public double ConvertToDollar() {
        double converter = value * 5.52;
        return converter;
    }
}
