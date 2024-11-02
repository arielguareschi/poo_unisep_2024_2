package br.edu.unisep.unbank.model;

public class Tigrinho extends Conta{
    public Tigrinho(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Perdeu playboy!!!");
    }


}
