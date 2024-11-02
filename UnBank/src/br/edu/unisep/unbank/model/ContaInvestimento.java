package br.edu.unisep.unbank.model;

public class ContaInvestimento extends Conta {

    private String produto;
    private double rendimento;

    public ContaInvestimento(String titular, double saldo, String produto, double rendimento) {
        super(titular, saldo);
        this.produto = produto;
        this.rendimento = rendimento;
    }

    @Override
    public void sacar(double valor) {
        double total = saldo *  (1+rendimento);
        if (total >= valor){
            saldo -= valor;
            System.out.println(titular +
                    " sacou " + valor +
                    " - saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}
