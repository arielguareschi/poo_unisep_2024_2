package br.edu.unisep.cidade.view.telas;

import br.edu.unisep.cidade.model.Cidade;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public class CidadeAddView {
    private List<Cidade> cidades;

    public CidadeAddView(List<Cidade> cidades) {
        this.cidades = cidades;
        exibir();
    }

    private void exibir(){
        JFrame janela = new JFrame("Adicionar Cidade");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500,500);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(
                janela, BoxLayout.Y_AXIS));
        JLabel jlCodigo = new JLabel("Codigo");
        JTextField jtfCodigo = new JTextField(10);
        painel.add(jlCodigo);
        painel.add(jtfCodigo);

        JButton jBtnAdd = new JButton("Salvar");
        jBtnAdd.addActionListener(e -> {
            Cidade cidade = new Cidade();
            cidade.setId(Integer.parseInt(
                    jtfCodigo.getText()));
            cidade.setNome("teste");
            cidade.setUf("pr");
            cidades.add(cidade);
        });
        painel.add(jBtnAdd);

        janela.add(painel);

        janela.setVisible(true);
    }
}
