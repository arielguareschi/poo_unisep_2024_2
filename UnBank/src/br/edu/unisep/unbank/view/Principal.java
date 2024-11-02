package br.edu.unisep.unbank.view;


import br.edu.unisep.unbank.model.*;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(
                "Tiburso",
                1000.0,
                500.0);
        Conta conta2 = new ContaPoupanca(
                "Zequinha",
                2000.0,
                0.02
        );
        conta1.depositar(200);
        conta1.sacar(1500);
        System.out.println();

        conta2.depositar(300);
        conta2.sacar(2500);
        ((ContaPoupanca) conta2).aplicarTaxa();

        System.out.println();
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        Conta tigrinho = new Tigrinho("Deide C.",
                5000.0);
        tigrinho.depositar(1000);
        tigrinho.sacar(1500);
        tigrinho.exibirSaldo();

        Conta investe = new ContaInvestimento(
                "Mecanica Simas",
                5000.0,
                "Turbos",
                0.04);
        investe.depositar(1500);
        investe.sacar(2500);
        investe.exibirSaldo();
    }
}
