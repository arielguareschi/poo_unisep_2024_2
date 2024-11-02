package br.edu.unisep.telas.view;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Tela");
        janela.setSize(500,500);
        janela.setDefaultCloseOperation(
                WindowConstants.EXIT_ON_CLOSE);


        JPanel painel = new JPanel();
        painel.setBackground(Color.CYAN);
        painel.setLayout(new GridLayout(1, 3));

        JLabel red = new JLabel("Red");
        red.setForeground(Color.RED);
        red.setFont(new Font("Arial",
                Font.BOLD, 20));
        painel.add(red);

        JTextField nome = new JTextField(20);
        painel.add(nome);

        JButton adicionar = new JButton("Add");
        painel.add(adicionar);

        janela.add(painel);
        janela.setVisible(true);
    }
}
