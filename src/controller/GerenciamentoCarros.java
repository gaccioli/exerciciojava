package controller;

import model.Carro;

public class GerenciamentoCarros {

    public static void main(String[] args){

        Carro c1 = new Carro();
        c1.setMarca("Fiat");
        c1.setQtdPessoa(4);

        Carro c2 = new Carro("Toyota", 4);
        System.out.println(c1.getMarca());
        System.out.println(c1.getQtdPessoa());

        System.out.println(c2.getMarca());
        System.out.println(c2.getQtdPessoa());

    }
}
