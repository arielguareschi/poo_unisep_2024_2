package br.edu.unisep.unbank.model;

public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(String titular, double saldo, double taxa) {
        super(titular, saldo);
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(titular +
                    " sacou " + valor +
                    " - saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void aplicarTaxa() {
        saldo += saldo * taxa;
        System.out.println("Rendimento aplicado." +
                " Saldo de " + titular + ": " + saldo);
    }
}
