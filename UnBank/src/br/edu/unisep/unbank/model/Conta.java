package br.edu.unisep.unbank.model;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo abstrato para usar o polimorfismo
    public abstract void sacar(double valor);

    // Metodo comum a todas as contas
    public void depositar(double valor){
        saldo += valor;
        System.out.println(titular +
                " depositou " +
                valor + " - Saldo " + saldo);
    }

    public void exibirSaldo(){
        System.out.println("Saldo de " + titular +
                ": " + saldo);
    }
}
