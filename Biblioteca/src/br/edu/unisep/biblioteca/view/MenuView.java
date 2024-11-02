package br.edu.unisep.biblioteca.view;

import javax.swing.*;

public class MenuView {
    public void exibir(){
        JFrame janela = new JFrame("Menu");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500,500);
        JPanel painel = new JPanel();
        JButton jBtnEditora = new JButton("Editora");
        jBtnEditora.addActionListener(e -> {
            EditoraView editora = new EditoraView();
            editora.exibir();
        });

        painel.add(jBtnEditora);
        janela.add(painel);
        janela.setVisible(true);
    }
}
