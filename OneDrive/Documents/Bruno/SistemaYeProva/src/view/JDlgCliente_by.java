/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author User
 */
public class JDlgCliente_by extends javax.swing.JDialog {

    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente_by(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Clientes");
        setLocationRelativeTo(null);
                Util.habilitar(false,jTxtCodigo_by,jTxtNome_by,jTxtCpf_by,
                jTxtBairro_by,jTxtCidade_by,jTxtDataNascimento_by,jCboEstadoCivil_by,
                jTxtEmail_by,jTxtNumeroDaResidencial_by,jTxtObservacao_by,jTxtCep_by,
                jTxtProfissao_by,jTxtRuaDaResidencia_by,jTxtTelefone_by,jCboSexo_by,jBtnConfirmar,jBtnCancelar);
    }
    
   public void habilitar(boolean valor){
        jBtnIncluir.setEnabled(!valor);
        jBtnAlterar.setEnabled(!valor);
        jBtnExcluir.setEnabled(!valor);
        jBtnPesquisar.setEnabled(!valor);
        jBtnCancelar.setEnabled( valor);
        jBtnConfirmar.setEnabled( valor);
        
        jTxtCodigo_by.setEnabled( valor);
        jTxtNome_by.setEnabled( valor);
        jTxtCpf_by.setEnabled( valor);
        jTxtBairro_by.setEnabled( valor);
        jTxtCidade_by.setEnabled( valor);
        jTxtDataNascimento_by.setEnabled( valor);
        jCboEstadoCivil_by.setEnabled( valor);
        jTxtEmail_by.setEnabled( valor);
        jTxtNumeroDaResidencial_by.setEnabled( valor);
        jTxtObservacao_by.setEnabled( valor);
        jTxtCep_by.setEnabled( valor);
        jTxtProfissao_by.setEnabled( valor);
        jTxtRuaDaResidencia_by.setEnabled( valor);
        jTxtTelefone_by.setEnabled( valor);
        jCboSexo_by.setEnabled(valor);
       
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo_by = new javax.swing.JTextField();
        jTxtDataNascimento_by = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtTelefone_by = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtCep_by = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtNome_by = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtCpf_by = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtProfissao_by = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtEmail_by = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtBairro_by = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtRuaDaResidencia_by = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtNumeroDaResidencial_by = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtObservacao_by = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtCidade_by = new javax.swing.JTextField();
        jCboEstadoCivil_by = new javax.swing.JComboBox<>();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jCboSexo_by = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jTxtCodigo_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigo_byActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de Nascimento");

        jLabel3.setText("Telefone");

        jTxtTelefone_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefone_byActionPerformed(evt);
            }
        });

        jLabel4.setText("CEP");

        jLabel5.setText("Nome");

        jTxtNome_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNome_byActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado Civíl");

        jLabel7.setText("CPF");

        jLabel8.setText("Profissão");

        jLabel9.setText("email");

        jTxtEmail_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmail_byActionPerformed(evt);
            }
        });

        jLabel10.setText("Bairro");

        jLabel12.setText("Rua da residência");

        jLabel13.setText("Número da residência");

        jLabel14.setText("Observação");

        jTxtObservacao_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtObservacao_byActionPerformed(evt);
            }
        });

        jLabel15.setText("Cidade");

        jCboEstadoCivil_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo", "Separado Judicialmente", " " }));
        jCboEstadoCivil_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboEstadoCivil_byActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel11.setText("Sexo");

        jCboSexo_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jCboSexo_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexo_byActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtObservacao_by)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jTxtCodigo_by, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jTxtCep_by, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTxtNome_by, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jTxtCidade_by, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jTxtRuaDaResidencia_by, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTxtNumeroDaResidencial_by, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtCpf_by, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtDataNascimento_by, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtTelefone_by, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtEmail_by, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTxtBairro_by, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCboEstadoCivil_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtProfissao_by, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addComponent(jCboSexo_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodigo_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNome_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCpf_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataNascimento_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCep_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBairro_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNumeroDaResidencial_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRuaDaResidencia_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEmail_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboEstadoCivil_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProfissao_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboSexo_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtObservacao_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtObservacao_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtObservacao_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtObservacao_byActionPerformed

    private void jTxtNome_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNome_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNome_byActionPerformed

    private void jTxtCodigo_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_byActionPerformed

    private void jTxtEmail_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmail_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmail_byActionPerformed

    private void jTxtTelefone_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefone_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefone_byActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
         Util.habilitar(true,jTxtCodigo_by,jTxtNome_by,jTxtCpf_by,
                jTxtBairro_by,jTxtCidade_by,jTxtDataNascimento_by,jCboEstadoCivil_by,
                jTxtEmail_by,jTxtNumeroDaResidencial_by,jTxtObservacao_by,jTxtCep_by,
                jTxtProfissao_by,jTxtRuaDaResidencia_by,jTxtTelefone_by,jCboSexo_by,jBtnConfirmar,jBtnCancelar);
         Util.habilitar(false,jBtnIncluir,jBtnAlterar,jBtnExcluir,jBtnPesquisar);
         Util.limpar(jTxtCodigo_by,jTxtNome_by,jTxtCpf_by,
                jTxtBairro_by,jTxtCidade_by,jTxtDataNascimento_by,jCboEstadoCivil_by,
                jTxtEmail_by,jTxtNumeroDaResidencial_by,jTxtObservacao_by,jTxtCep_by,
                jTxtProfissao_by,jTxtRuaDaResidencia_by,jTxtTelefone_by,jCboSexo_by);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        habilitar(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
      int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão", "Deletar registro", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_OPTION){
            Clientes_by clientes = new Clientes_by();
            
        int cod = Integer.parseInt(jTxtCodigo_by.getText());
        clientes.setIdclientes_by(cod);
        
        clientes.setNome_by(jTxtNome_by.getText());
        clientes.setBairro_by(jTxtBairro_by.getText());
        clientes.setCep_by(jTxtCep_by.getText());
        clientes.setDataNascimento_by(null);
        clientes.setCidade_by(jTxtCidade_by.getText());
        clientes.setCpf_by(jTxtCpf_by.getText());
        clientes.setEmail_by(jTxtEmail_by.getText());
        clientes.setEstado_civil_by((String) jCboEstadoCivil_by.getSelectedItem());
        clientes.setSexo_by((String) jCboSexo_by.getSelectedItem());
        
        int num = Integer.parseInt(jTxtNumeroDaResidencial_by.getText());
        clientes.setNumero_da_residencia_by(num);
        
        clientes.setTelefone_by(jTxtTelefone_by.getText());
        clientes.setObservacao_by(jTxtObservacao_by.getText());
        clientes.setProfissao_by(jTxtProfissao_by.getText());
        clientes.setRua_da_residencia_by(jTxtRuaDaResidencia_by.getText());
        
        
  
        Clientes_byDAO clientesDAO = new Clientes_byDAO();
        clientesDAO.delete(clientes);
        
        }
        //JOptionPane.showMessageDialog(null, "Exclusão ok ");
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
 String resp = JOptionPane.showInputDialog(null, "Entre com o código do funcionario");
        
           Clientes_byDAO clientesDAO = new Clientes_byDAO();
           
           Clientes_by clientes = (Clientes_by) clientesDAO.list(Integer.valueOf (resp));
           resp = String.valueOf(clientes.getIdclientes_by());
           
           jTxtCodigo_by.setText(resp);
           jTxtBairro_by.setText(clientes.getBairro_by());
           jTxtCep_by.setText(clientes.getCep_by());
           jTxtCidade_by.setText(clientes.getCidade_by());
           jTxtCpf_by.setText(clientes.getCpf_by());
           jTxtEmail_by.setText(clientes.getEmail_by());
           jTxtNome_by.setText(clientes.getNome_by());
           
           jTxtNumeroDaResidencial_by.setText(resp);
           
           jTxtObservacao_by.setText(clientes.getObservacao_by());
           jTxtProfissao_by.setText(clientes.getProfissao_by());
           jTxtRuaDaResidencia_by.setText(clientes.getRua_da_residencia_by());
           
           
           jTxtNumeroDaResidencial_by.setText(resp);
        
           jTxtTelefone_by.setText(clientes.getTelefone_by());

      
           jCboEstadoCivil_by.setSelectedItem(clientes.getEstado_civil_by());
           jCboSexo_by.setSelectedItem(clientes.getSexo_by());
           
  
        
           
           
           
           
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        
          Clientes_by clientes = new Clientes_by();
          
         int cod = Integer.parseInt(jTxtCodigo_by.getText());
        clientes.setIdclientes_by(cod);
        
        clientes.setNome_by(jTxtNome_by.getText());
        clientes.setBairro_by(jTxtBairro_by.getText());
        clientes.setCep_by(jTxtCep_by.getText());
        clientes.setDataNascimento_by(null);
        clientes.setCidade_by(jTxtCidade_by.getText());
        clientes.setCpf_by(jTxtCpf_by.getText());
        clientes.setEmail_by(jTxtEmail_by.getText());
        clientes.setEstado_civil_by((String) jCboEstadoCivil_by.getSelectedItem());
        clientes.setSexo_by((String)jCboSexo_by.getSelectedItem());
        int num = Integer.parseInt(jTxtNumeroDaResidencial_by.getText());
        clientes.setNumero_da_residencia_by(num);
        
        clientes.setTelefone_by(jTxtTelefone_by.getText());
        clientes.setObservacao_by(jTxtObservacao_by.getText());
        clientes.setProfissao_by(jTxtProfissao_by.getText());
        clientes.setRua_da_residencia_by(jTxtRuaDaResidencia_by.getText());
        
        
  
        Clientes_byDAO clientesDAO = new Clientes_byDAO();
        clientesDAO.insert(clientes);
        
        habilitar(false); 
        
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jCboEstadoCivil_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboEstadoCivil_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboEstadoCivil_byActionPerformed

    private void jCboSexo_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexo_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexo_byActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente_by.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_by.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_by.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_by.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente_by dialog = new JDlgCliente_by(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboEstadoCivil_by;
    private javax.swing.JComboBox<String> jCboSexo_by;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro_by;
    private javax.swing.JTextField jTxtCep_by;
    private javax.swing.JTextField jTxtCidade_by;
    private javax.swing.JTextField jTxtCodigo_by;
    private javax.swing.JTextField jTxtCpf_by;
    private javax.swing.JTextField jTxtDataNascimento_by;
    private javax.swing.JTextField jTxtEmail_by;
    private javax.swing.JTextField jTxtNome_by;
    private javax.swing.JTextField jTxtNumeroDaResidencial_by;
    private javax.swing.JTextField jTxtObservacao_by;
    private javax.swing.JTextField jTxtProfissao_by;
    private javax.swing.JTextField jTxtRuaDaResidencia_by;
    private javax.swing.JTextField jTxtTelefone_by;
    // End of variables declaration//GEN-END:variables
}