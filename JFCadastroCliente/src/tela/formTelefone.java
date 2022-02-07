/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controle.TelefoneControle;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import modelo.Telefone;

/**
 *
 * @author Chrystian
 */
public class formTelefone extends javax.swing.JFrame {

    /**
     * Creates new form formTelefone
     */
    private DefaultTableModel dtmtelefones = null;
    private MaskFormatter telMask = null;

    public formTelefone() {
        initComponents();

        try {

            telMask = new MaskFormatter("#####-####");
            this.txtTelefone.setFormatterFactory(new DefaultFormatterFactory(telMask));

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtDDD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelefones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("DDD:");

        jLabel2.setText("Tel:");

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setText("Remover");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        tblTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DDD", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblTelefones);
        if (tblTelefones.getColumnModel().getColumnCount() > 0) {
            tblTelefones.getColumnModel().getColumn(0).setResizable(false);
            tblTelefones.getColumnModel().getColumn(1).setResizable(false);
            tblTelefones.getColumnModel().getColumn(1).setPreferredWidth(25);
            tblTelefones.getColumnModel().getColumn(2).setResizable(false);
            tblTelefones.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jLabel3.setText("Digite o ID do Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnAdd)
                    .addComponent(btnDel)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(711, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        this.BuscarPorID();


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        int idcliente = Integer.parseInt(txtID.getText());
        String ddd = txtDDD.getText();
        String numTel = txtTelefone.getText();

        Telefone tel = new Telefone();

        tel.setDdd(ddd);
        tel.setTelefone(numTel);
        tel.setIdcliente(idcliente);

        Boolean inseriu = TelefoneControle.Inserir(tel);

        if (inseriu == true) {

            this.limpaTabela();
            this.BuscarPorID();

            JOptionPane.showMessageDialog(null,
                    "Telefone Cadastrado com sucesso!");

        } else {
            JOptionPane.showMessageDialog(null,
                    "Não efetuou o cadastro do Telefone do Cliente!");
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:

        this.BuscarPorID();
    }//GEN-LAST:event_txtIDKeyPressed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:

        int idtelefone = Integer.parseInt(tblTelefones.getValueAt(this.tblTelefones.getSelectedRow(), 0).toString());
        Boolean apagou = TelefoneControle.Apagar(idtelefone);

        if (apagou == true) {

            this.dtmtelefones.removeRow(this.tblTelefones.getSelectedRow());
            JOptionPane.showMessageDialog(null,
                    "Telefone Removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Houve um erro na remoção do telefone!");
        }


    }//GEN-LAST:event_btnDelActionPerformed

    public void limpaTabela() {
        DefaultTableModel tblRemove = (DefaultTableModel) tblTelefones.getModel();

        if (tblRemove.getRowCount() > 0) {
            for (int i = 1; i <= tblRemove.getRowCount(); i++) {
                tblRemove.removeRow(0);
            }
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
            java.util.logging.Logger.getLogger(formTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTelefone().setVisible(true);
            }
        });
    }

    private void BuscarPorID() {
        int idcliente = Integer.parseInt(txtID.getText());

        List<Telefone> Telefones = TelefoneControle.ListarTodosID(idcliente);

        if (Telefones.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Não há Telefones do Cliente!");
        } else {
            this.dtmtelefones = (DefaultTableModel) tblTelefones.getModel();

            for (Telefone t : Telefones) {
                String[] dados = {String.valueOf(t.getIdtelefone()), t.getDdd(), t.getTelefone()};
                this.dtmtelefones.addRow(dados);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTelefones;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtID;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}