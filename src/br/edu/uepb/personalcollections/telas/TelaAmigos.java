package br.edu.uepb.personalcollections.telas;

import br.edu.uepb.personalcollections.enums.Parentesco;
import br.edu.uepb.personalcollections.excecoes.PersonalCollectionsException;
import br.edu.uepb.personalcollections.excecoes.ValidacaoException;
import br.edu.uepb.personalcollections.gerenciador.Gerenciador;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import br.edu.uepb.personalcollections.Amigo;
import br.edu.uepb.personalcollections.util.Validacao;

/**
 * Tela gerenciamento de Amigos
 *
 * @author Douglas Rafael
 */
public class TelaAmigos extends javax.swing.JDialog {

    private static final long serialVersionUID = 7271224899690477236L;

    private final String STRINFORDEL = "Todo histórico relacionado ao amigo, como por exemplo os empréstimos serão perdidos!";
    private final String STRCADASTRAR = "Cadastrar";
    private final String STRATUALIZAR = "Atualizar";
    private static int id;
    private DefaultTableModel modelTable;

    private Gerenciador manager;
    private TelaPrincipal telaPrincipal;

    /**
     * Contrutor TelaAmigos
     *
     * @param parent
     * @param modal
     */
    public TelaAmigos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        manager = new Gerenciador();
        if (parent != null) {
            this.telaPrincipal = (TelaPrincipal) parent;
        }

        initComponents();
        modelTable = (DefaultTableModel) table_amigos.getModel();
        montaTabelaAmigos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_sexo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_inserir = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        tf_telefone = new javax.swing.JFormattedTextField();
        cb_parentesco = new javax.swing.JComboBox();
        panel_dlc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_amigos = new javax.swing.JTable();
        bt_deletar = new javax.swing.JButton();
        tf_endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        bt_novo = new javax.swing.JButton();
        rb_m = new javax.swing.JRadioButton();
        rb_f = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Amigos");
        setIconImage(new ImageIcon("images/logo.png").getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        tf_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_nome.setMargin(new java.awt.Insets(2, 5, 2, 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Parentesco");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("E-Mail");

        bt_inserir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_inserir.setIcon(new ImageIcon("images/save.png"));
        bt_inserir.setText("Cadastrar");
        bt_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acao(evt);
            }
        });

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_cancelar.setIcon(new ImageIcon("images/cancel.png"));
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        try {
            tf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_telefone.setMargin(new java.awt.Insets(2, 5, 2, 2));

        cb_parentesco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_parentesco.setModel(new DefaultComboBoxModel(Parentesco.values()));

        panel_dlc.setBorder(javax.swing.BorderFactory.createTitledBorder("Útimos Amigos Cadastrados"));

        table_amigos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_amigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Parentesco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_amigos.setToolTipText("Dê um duplo clique no DLC para remove-lo da lista...");
        table_amigos.getTableHeader().setReorderingAllowed(false);
        table_amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linhaSelecionada(evt);
            }
        });
        jScrollPane3.setViewportView(table_amigos);
        if (table_amigos.getColumnModel().getColumnCount() > 0) {
            table_amigos.getColumnModel().getColumn(0).setPreferredWidth(50);
            table_amigos.getColumnModel().getColumn(0).setMaxWidth(50);
            table_amigos.getColumnModel().getColumn(2).setPreferredWidth(120);
            table_amigos.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        javax.swing.GroupLayout panel_dlcLayout = new javax.swing.GroupLayout(panel_dlc);
        panel_dlc.setLayout(panel_dlcLayout);
        panel_dlcLayout.setHorizontalGroup(
            panel_dlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dlcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_dlcLayout.setVerticalGroup(
            panel_dlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dlcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bt_deletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_deletar.setIcon(new ImageIcon("images/delete.png"));
        bt_deletar.setText("Deletar");
        bt_deletar.setEnabled(false);
        bt_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAmigo(evt);
            }
        });

        tf_endereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_endereco.setMargin(new java.awt.Insets(2, 5, 2, 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Endereço");

        tf_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_email.setMargin(new java.awt.Insets(2, 5, 2, 2));

        bt_novo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_novo.setIcon(new ImageIcon("images/new.png"));
        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAmigo(evt);
            }
        });

        group_sexo.add(rb_m);
        rb_m.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_m.setSelected(true);
        rb_m.setText("Masculino");

        group_sexo.add(rb_f);
        rb_f.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_f.setText("Feminino");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_dlc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                    .addGap(64, 64, 64)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)))
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(rb_m)
                                .addGap(18, 18, 18)
                                .addComponent(rb_f))
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cb_parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_m)
                    .addComponent(rb_f))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(cb_parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addComponent(panel_dlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        // Atualiza a tela principal
        telaPrincipal.refresh();
        this.dispose();
    }//GEN-LAST:event_fecharJanela

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        fecharJanela(null);
    }//GEN-LAST:event_cancelar

    /**
     * Verifica se a ação é de inserção ou atualização e chama seu respectivo
     * método.
     *
     * @param evt
     */
    private void acao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acao
        try {
            if (Validacao.validarCamposVazios(panelPrincipal, getCamposValidar())) {
                throw new ValidacaoException("O prenechimento dos seguintes campos são obrigatórios:"
                        + "\nNome");
            } else {
                Amigo amigo = getAmigoInterface();
                if (amigo != null) {
                    if (isInsert()) {
                        inserir(amigo);
                    } else if (isUpadate()) {
                        atualizar(amigo);
                    }
                }
            }
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Problema na validação", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_acao

    /**
     * Remove o Amigo
     *
     * @param evt
     */
    private void removeAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAmigo
        try {
            if (getId() > 0) {
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente remover o amigo(a): " + tf_nome.getText() + "?\n" + STRINFORDEL, "Deletar amigo", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {
                    if (!manager.removerAmigo(getId())) {
                        throw new PersonalCollectionsException("Não foi possível remover o amigo(a): " + tf_nome.getText());
                    } else {
                        JOptionPane.showMessageDialog(null, "Amigo(a) removido com sucesso!", "Remorção", JOptionPane.INFORMATION_MESSAGE);
                        limpaCampos();
                        montaTabelaAmigos();
                    }
                }
            }
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Problema na exclusão!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeAmigo

    /**
     * Remove dlc da lista de DLC's
     *
     * @param evt
     */
    private void linhaSelecionada(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linhaSelecionada
        int linha = table_amigos.getSelectedRow();
        if (evt.getClickCount() == 1) {
            TelaAmigos.id = Integer.parseInt((String) table_amigos.getValueAt(linha, 0));
            montaAlterarDados(getId());
        }
    }//GEN-LAST:event_linhaSelecionada

    private void novoAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAmigo
        limpaCampos();
        bt_inserir.setText(STRCADASTRAR);
    }//GEN-LAST:event_novoAmigo

    /**
     * Preenche tabela com os Amigos
     *
     * @param dlc
     */
    private void montaTabelaAmigos() {
        try {
            modelTable.setNumRows(0);
            List<Amigo> listaDeAmigos = new ArrayList<>(manager.listarAmigos());
            Collections.sort(listaDeAmigos);
            if (!listaDeAmigos.isEmpty()) {
                for (Amigo amigo : listaDeAmigos) {
                    Object[] o = {String.format("%04d", amigo.getId()), amigo.getNome(), amigo.getParentesco().getNome()};
                    modelTable.addRow(o);
                }
            }
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Problema na tentativa de obter lista de amigos!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Insere Amigo
     *
     * @param amigo
     */
    private void inserir(Amigo amigo) {
        try {
            manager.inserirAmigo(amigo);
            JOptionPane.showMessageDialog(null, "Amigo(a) inserido(a) com sucesso!", "Inserção", JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            montaTabelaAmigos();
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar inserir o Amigo(a)", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Atualiza dados do Amigo
     *
     * @param amigo
     */
    private void atualizar(Amigo amigo) {
        try {
            manager.atualizarAmigo(amigo);
            JOptionPane.showMessageDialog(null, "Amigo(a) atualizado(a) com sucesso!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            montaTabelaAmigos();
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar atualizar o Amigo(a)", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAmigos dialog = new TelaAmigos(new javax.swing.JFrame(), true);
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

    /**
     * Verifica se o estado do form é de inserção
     *
     * @return
     */
    public boolean isInsert() {
        return bt_inserir.getText().equals(STRCADASTRAR);
    }

    /**
     * Verifica se o estado do form é de atualização
     *
     * @return
     */
    public boolean isUpadate() {
        return bt_inserir.getText().equals(STRATUALIZAR);
    }

    /**
     * Retorna o valor de id, o qual é uma variavel static da classe
     *
     * @return int
     */
    private int getId() {
        return TelaAmigos.id;
    }

    /**
     * Retorna os campos que devem ser validados (obrigatórios)
     *
     * @return Lista com os components
     */
    public List<Component> getCamposValidar() {
        List<Component> components = new ArrayList<>();
        components.add(tf_nome);
        return components;
    }

    /**
     * Limpa todos os campos
     */
    private void limpaCampos() {
        Component components[] = panelPrincipal.getComponents();
        for (Component component : components) {
            if (component instanceof JTextComponent) {
                ((JTextField) component).setText("");
            }
        }
        bt_inserir.setText(STRCADASTRAR);
        bt_deletar.setEnabled(false);
        cb_parentesco.setSelectedIndex(0);
        tf_nome.grabFocus();
        rb_m.setSelected(true);
    }

    /**
     * Monta o objeto Amigo com os dados oriundos da interface
     *
     * @return Amigo
     */
    private Amigo getAmigoInterface() {
        String nome = tf_nome.getText();
        String endereco = tf_endereco.getText();
        String telefone = (String) tf_telefone.getValue();
        String email = tf_email.getText();
        char sexo = rb_m.isSelected() ? 'M' : 'F';
        Parentesco parentesco = (Parentesco) cb_parentesco.getSelectedItem();

        if (isInsert()) {
            manager.setIdAmigo();
            return new Amigo(nome, sexo, endereco, telefone, email, parentesco);
        } else {
            return new Amigo(getId(), nome, sexo, endereco, telefone, email, parentesco);
        }
    }

    /**
     * Monta a interface com os dados para atualização
     *
     * @param idAmigo
     */
    private void montaAlterarDados(int idAmigo) {
        try {
            limpaCampos();
            Amigo amigo = manager.pesquisarAmigo(idAmigo);
            if (amigo != null) {
                bt_deletar.setEnabled(true); // habilita o botao deletar
                TelaAmigos.id = amigo.getId(); // seta o valor do id para variavel static 
                bt_inserir.setText(STRATUALIZAR);

                tf_nome.setText(amigo.getNome());
                tf_endereco.setText(amigo.getEndereco());
                tf_telefone.setValue(amigo.getTelefone());
                tf_email.setText(amigo.getEmail());
                cb_parentesco.setSelectedItem(amigo.getParentesco());

                if (amigo.getSexo() == 'F') {
                    rb_f.setSelected(true);
                } else {
                    rb_m.setSelected(true);
                }
            }
        } catch (PersonalCollectionsException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar montar os dados do item para atualização", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_deletar;
    private javax.swing.JButton bt_inserir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JComboBox cb_parentesco;
    private javax.swing.ButtonGroup group_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panel_dlc;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTable table_amigos;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JFormattedTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}
