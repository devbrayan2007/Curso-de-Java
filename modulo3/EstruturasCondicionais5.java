package modulo3;

public class EstruturasCondicionais5 {
    public static void main(String[] args) {
        // USO DO SWITCH
        byte dias = 1;

        switch (dias){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case  7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        char sexo = 'G';

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Sexo inexistente!");
                break;
        }
    }
}
