package modulo7.ModificadorStatic;

import exercicios.ex029.Car;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes",  275);
        Carro carro3 = new Carro("Audi", 290);


        Carro.velocidadeLimite = 180;

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
