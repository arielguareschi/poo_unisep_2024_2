package br.edu.unisep.calculator.view;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /*
            Criar uma calculadora, que o usuario
            vai digitando numeros ate digitar vazio
            entao vai solicitar a operacao e
            realizar o calculo.
         */
        // cria a lista para armazenar os numeros
        List<Double> values = new ArrayList<>();
        // variavel para guardar o que foi digitado
        String input = "";

        // laco para ir pedindo os numeros
        do{
            // realiza a leitura do numero
            input = JOptionPane
                .showInputDialog("Digite um numero");
            if (!input.equals("")){
                try {
                    // faz a conversao para Double
                    Double num = Double.parseDouble(input);
                    // adiciona o numero na lista
                    values.add(num);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(
                            null,
                            "Numero invalido " + e.getMessage()
                    );
                }
            }
        } while (!input.equals(""));

        String opt = JOptionPane
            .showInputDialog("Digite a operacao");

        Double total = 0.0;
        switch(opt){
            case "+":
                for (Double num : values){
                    total += num;
                }
                break;
            case "-":
                for (Double num : values){
                    if (total == 0.0){
                        total = num;
                        continue;
                    }
                    total -= num;
                }
                break;
            case "*":
                total = 1.0;
                for (Double num : values){
                    total *= num;
                }break;
            case "/":
                total = 1.0;
                for (Double num : values){
                    if (num == 0.0){
                        continue;
                    }
                    total /= num;
                }
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Operacao invalida!");
                break;
        }
        JOptionPane.showMessageDialog(
                null,
                "O resultado e: " + total);

    }
}
