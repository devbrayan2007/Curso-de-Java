package modulo2;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        // =
        double bonus = 1000;

        // +=
        bonus += 1000;
        System.out.println(bonus);

        // -=
        bonus -= 1000;
        System.out.println(bonus);

        // *=
        bonus *= 2;
        System.out.println(bonus);

        // /=
        bonus /= 2;
        System.out.println(bonus);

        // %=
        bonus %= 2;
        System.out.println(bonus);


        // Operadores de Decremento e Incremento
        int contador = 0;
        contador++;
        System.out.println(contador);
        // pré-incremento
        ++contador;
        System.out.println(contador);

        contador--;
        System.out.println(contador);
        // pré-decremento
        --contador;
        System.out.println(contador);
    }
}
