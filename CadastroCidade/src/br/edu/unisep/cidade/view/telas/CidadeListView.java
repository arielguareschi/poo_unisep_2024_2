package br.edu.unisep.cidade.view.telas;


import br.edu.unisep.cidade.model.Cidade;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CidadeListView {
    private List<Cidade> cidades;
    private DefaultTableModel model;

    public CidadeListView(List<Cidade> cidades) {
        this.cidades = cidades;
        exibir();
    }

    private void carregarTabela(){
        String[] colunas = {"Código", "Nome", "Estado"};
        model = new DefaultTableModel(colunas, 0);
        for (Cidade c : cidades){
            model.addRow(new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getUf()});
        }
    }

    private void exibir(){
        JFrame janela = new JFrame("Lista de Cidade");
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.setSize(500,500);
        janela.setLayout(new BorderLayout());

        carregarTabela();

        JPopupMenu popup = new JPopupMenu();
        JMenuItem editarItem = new JMenuItem("Editar");
        JMenuItem excluirItem = new JMenuItem("Excluir");
        popup.add(editarItem);
        popup.add(excluirItem);

        JPanel pnTabela = new JPanel();
        JTable tabela = new JTable(model);
        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()){
                    int row = tabela.getSelectedRow();
                    tabela.setRowSelectionInterval(row, row);
                    popup.show(tabela, e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()){
                    int row = tabela.getSelectedRow();
                    tabela.setRowSelectionInterval(row, row);
                    popup.show(tabela, e.getX(), e.getY());
                }
            }
        });

        excluirItem.addActionListener(e-> {
            int row = tabela.getSelectedRow();
            if (row != -1){
                cidades.remove(row);
                model.removeRow(row);
            }
        });

        JScrollPane scroll = new JScrollPane(tabela);
        pnTabela.add(scroll);
        janela.add(pnTabela, BorderLayout.CENTER);
        janela.setVisible(true);
    }
}
