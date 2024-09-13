package exercicios;

public class ex010 {
    public static void main(String[] args) {
        byte dias = 4;

        switch (dias) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
        
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
