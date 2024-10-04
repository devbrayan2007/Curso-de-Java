package modulo7.MetodosEstaticos;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 270);
        Carro carro3 = new Carro("Audi", 290);



        carro1.imprimirDados();
        carro2.imprimirDados();
        carro3.imprimirDados();

    }
}
