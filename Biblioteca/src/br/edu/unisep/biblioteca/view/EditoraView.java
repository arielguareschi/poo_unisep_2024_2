package br.edu.unisep.biblioteca.view;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class EditoraView {
    public void exibir(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JFrame janela = new JFrame("Cadastro de Editora");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500,500);
        JPanel painel = new JPanel();
        JLabel titulo = new JLabel("Cadastro de Editora");
        painel.add(titulo);
        janela.add(painel);
        janela.setVisible(true);
    }

}
