package br.edu.uepb.personalcollections.telas;

import br.edu.uepb.personalcollections.Item;
import br.edu.uepb.personalcollections.Serie;
import br.edu.uepb.personalcollections.enums.TipoItem;
import br.edu.uepb.personalcollections.excecoes.PersonalCollectionsException;
import br.edu.uepb.personalcollections.excecoes.ValidacaoException;
import br.edu.uepb.personalcollections.gerenciador.Gerenciador;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * Interface gráfica. Tela para listar Séries cadastradas
 *
 * @author Douglas Rafael
 */
public class TelaSeries extends javax.swing.JDialog {

    private static final long serialVersionUID = -4029400460649518708L;

    private DefaultTableModel modelTable;
    private Gerenciador manager;
    private List<Serie> listaDeSeries;

    /**
     * Método construtor TelaSeries
     */
    public TelaSeries(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        manager = new Gerenciador();

        initComponents();
        populaCoponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_series = new javax.swing.JTable();
        cb_itens = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_cancelar = new javax.swing.JButton();
        bt_deletar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        br_cadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Séries");
        setIconImage(new ImageIcon("images/logo.png").getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Séries Cadastradas"));

        table_series.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_series.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título da série", "Itens", "Total de Itens"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_series.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ativaBotoes(evt);
            }
        });
        jScrollPane1.setViewportView(table_series);
        if (table_series.getColumnModel().getColumnCount() > 0) {
            table_series.getColumnModel().getColumn(0).setPreferredWidth(50);
            table_series.getColumnModel().getColumn(0).setMaxWidth(50);
            table_series.getColumnModel().getColumn(3).setPreferredWidth(90);
            table_series.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        cb_itens.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("Itens");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("(Selecione um item para criar uma série a partir desse item...)");

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_cancelar.setIcon(new ImageIcon("images/cancel.png"));
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar(evt);
            }
        });

        bt_deletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_deletar.setIcon(new ImageIcon("images/delete.png"));
        bt_deletar.setText("Deletar");
        bt_deletar.setEnabled(false);
        bt_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarSerie(evt);
            }
        });

        bt_editar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_editar.setIcon(new ImageIcon("images/edit.png"));
        bt_editar.setText("Editar");
        bt_editar.setEnabled(false);
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSerie(evt);
            }
        });

        br_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        br_cadastrar.setIcon(new ImageIcon("images/insert.png"));
        br_cadastrar.setText("Criar Série");
        br_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarSerie(evt);
            }
        });

        jLabel3.setText("Total de séries cadastradas: ");

        lb_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_total.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(0, 207, Short.MAX_VALUE))
                                    .addComponent(cb_itens, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(br_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(br_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lb_total))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fecha a tela.
     *
     * @param evt
     */
    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();
    }//GEN-LAST:event_fecharJanela

    /**
     * Fecha a tela.
     *
     * @param evt
     */
    private void bt_cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar
        fecharJanela(null);
    }//GEN-LAST:event_bt_cancelar

    /**
     * Abre tela de criar série.
     *
     * @param evt
     */
    private void criarSerie(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarSerie
        try {
            if (cb_itens.getItemCount() > 0) {
                String tempItem[] = ((String) cb_itens.getSelectedItem()).split("([\\[\\]])");
                String tipo = tempItem[3];
                TipoItem tipo_item = null;

                // Verifica qual o tipo de item
                if (tipo.equals(TipoItem.HQ.getTitulo())) {
                    tipo_item = TipoItem.HQ;
                } else if (tipo.equals(TipoItem.MIDIA.getTitulo())) {
                    tipo_item = TipoItem.MIDIA;
                } else if (tipo.equals(TipoItem.JOGOVIDEOGAME.getTitulo())) {
                    tipo_item = TipoItem.JOGOVIDEOGAME;
                } else if (tipo.equals(TipoItem.JOGOTABULEIRO.getTitulo())) {
                    tipo_item = TipoItem.JOGOTABULEIRO;
                }

                // Busca o item completo
                Item itemSelecionado = manager.pesquisarItem(Integer.parseInt(tempItem[1]), tipo_item);
                if (itemSelecionado == null) {
                    throw new ValidacaoException("Item selecionado não encontrado no sistema!");
                } else {
                    // Cadastra série com o item selecionado
                    List<Item> listaDeItens = new ArrayList<>();
                    listaDeItens.add(itemSelecionado);
                    Serie s = new Serie("", listaDeItens);
                    s.setTitulo("Série n°: " + s.getId());
                    manager.inserirSerie(s);

                    fecharJanela(null);
                    TelaCadastroSerie.setFlag(true);
                    TelaCadastroSerie.setTitulo(s.getTitulo());
                    new TelaCadastroSerie(null, true, null, s.getId()).setVisible(true);
                }
            } else {
                throw new ValidacaoException("Para cadastrar uma nova série é necessário ter pelo menos um item disponível,"
                        + "\nou que não esteja associado a outra série já cadastrada.");
            }
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Validação", JOptionPane.INFORMATION_MESSAGE);
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar selecionar os dados", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_criarSerie

    /**
     * Ativa botoes deletar e editar ao selecionar o item da tabela.
     *
     * @param evt
     */
    private void ativaBotoes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativaBotoes
        if (evt.getClickCount() == 1) {
            bt_deletar.setEnabled(true);
            bt_editar.setEnabled(true);
        }
    }//GEN-LAST:event_ativaBotoes

    /**
     * Remove série.
     *
     * @param evt
     */
    private void deletarSerie(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarSerie
        int linha = table_series.getSelectedRow();
        if (linha >= 0) {
            try {
                int id = Integer.parseInt((String) table_series.getValueAt(linha, 0));
                String titulo = (String) table_series.getValueAt(linha, 1);
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente remover a série: \"" + titulo + "\"?", "Deletar série", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {
                    if (!manager.removerSerie(id)) {
                        throw new PersonalCollectionsException("Não foi possível remover a série: \"" + titulo + "\". Tente novamente!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Série de título: \"" + titulo + "\" foi removida com sucesso!", "Remoção", JOptionPane.INFORMATION_MESSAGE);
                        populaCoponents();
                    }
                }
            } catch (PersonalCollectionsException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar selecionar a série", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_deletarSerie

    /**
     * Abre tela para edição da série.
     *
     * @param evt
     */
    private void editarSerie(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSerie
        try {
            fecharJanela(null);
            int linha = table_series.getSelectedRow();
            int idSerie = Integer.parseInt((String) table_series.getValueAt(linha, 0));
            Serie s = manager.pesquisarSerie(idSerie);

            if (s != null) {
                TelaCadastroSerie.setFlag(true);
                TelaCadastroSerie.setTitulo(s.getTitulo());
                new TelaCadastroSerie(null, true, null, s.getId()).setVisible(true);
            }
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar selecionar a série para edição...", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarSerie

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaSeries dialog = new TelaSeries(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton br_cadastrar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_deletar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JComboBox cb_itens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTable table_series;
    // End of variables declaration//GEN-END:variables

    /**
     * Popula os principais componentes.
     *
     */
    private void populaCoponents() {
        try {
            cb_itens.removeAllItems();
            // popula combo com as series disponiveis para o cadastro de nova serie
            List<Item> listaDeItens = manager.getItensDisponivelSerie();
            if (listaDeItens.isEmpty()) {
                bt_editar.setEnabled(false);
            } else {
                for (Item item : listaDeItens) {
                    cb_itens.addItem(String.format("[%04d] ", item.getId()) + item.getTitulo() + " [" + item.getTipo().getTitulo() + "]");
                }
            }
            //Popula Tabela de series
            montaTabela();
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar popular componentes...", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Popula tabela com dados de series cadastradas.
     *
     */
    private void montaTabela() {
        try {
            listaDeSeries = manager.listarSeries();
            Collections.sort(listaDeSeries);
            modelTable = (DefaultTableModel) table_series.getModel();
            modelTable.setNumRows(0); // Zera a tabela
            if (!listaDeSeries.isEmpty()) {
                int total_itens = listaDeSeries.size();

                for (Serie s : listaDeSeries) {
                    Object[] o = {String.format("%04d", s.getId()), s.getTitulo(), s.getStringItens(), String.format("%04d", s.getTotalItens())};
                    modelTable.addRow(o);
                }
                lb_total.setText(String.valueOf(total_itens));
            } else {
                bt_deletar.setEnabled(false);
            }
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar popular tabela...", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}