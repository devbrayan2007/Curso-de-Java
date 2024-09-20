package modulo7.ReferenciaDeObjetos;

import modulo7.Classes.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Dodge";
        carro1.modelo = "Challenge";
        carro1.ano = 2021;

        carro2.nome = "FIAT";
        carro2.modelo = "Siena";
        carro2.ano = 2020;

        carro1 = carro2;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("-------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
