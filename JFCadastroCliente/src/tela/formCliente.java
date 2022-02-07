/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controle.ClienteControle;
import controle.EnderecoControle;
import controle.TelefoneControle;
import java.sql.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Telefone;

/**
 *
 * @author Chrystian
 */
public class formCliente extends javax.swing.JFrame {

    public int idusuario = 0;
    private MaskFormatter cpfMask = null;
    private MaskFormatter cnpjMask = null;
    private MaskFormatter dtMask = null;
    private MaskFormatter telMask = null;

    /**
     * Creates new form frmCliente
     */
    public formCliente() {
        initComponents();

        try {

            cpfMask = new MaskFormatter("###.###.###-##");
            dtMask = new MaskFormatter("####-##-##");
            telMask = new MaskFormatter("(##) #####-####");

            this.lblNome.setText("Nome:");
            this.lblDoc.setText("CPF:");
            this.lblData.setText("Data de Nascimento:");
            this.txtDoc.setFormatterFactory(new DefaultFormatterFactory(cpfMask));
            this.txtData.setFormatterFactory(new DefaultFormatterFactory(dtMask));
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

        gruporadio = new javax.swing.ButtonGroup();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        pnlTipoPessoa = new javax.swing.JPanel();
        rdbPF = new javax.swing.JRadioButton();
        rdbPJ = new javax.swing.JRadioButton();
        btnProcurar = new javax.swing.JButton();
        pnlDadosCadastrais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDoc = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDoc = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        pnlTelefone = new javax.swing.JPanel();
        btnNovoTel = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        pnlLocalizacao = new javax.swing.JPanel();
        lblComplemento = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox<>();
        btnNovoTel1 = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID.setText("ID:");

        txtID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        pnlTipoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Pessoa"));
        pnlTipoPessoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gruporadio.add(rdbPF);
        rdbPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbPF.setText("Física");
        rdbPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPFActionPerformed(evt);
            }
        });

        gruporadio.add(rdbPJ);
        rdbPJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbPJ.setText("Jurídica");
        rdbPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTipoPessoaLayout = new javax.swing.GroupLayout(pnlTipoPessoa);
        pnlTipoPessoa.setLayout(pnlTipoPessoaLayout);
        pnlTipoPessoaLayout.setHorizontalGroup(
            pnlTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(rdbPJ)
                .addContainerGap())
        );
        pnlTipoPessoaLayout.setVerticalGroup(
            pnlTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoPessoaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPF)
                    .addComponent(rdbPJ))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        pnlDadosCadastrais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cadastrais"));

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblDoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDoc.setText("CPF:");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("Data de Nascimento:");

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlDadosCadastraisLayout = new javax.swing.GroupLayout(pnlDadosCadastrais);
        pnlDadosCadastrais.setLayout(pnlDadosCadastraisLayout);
        pnlDadosCadastraisLayout.setHorizontalGroup(
            pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblDoc))
                        .addGap(115, 115, 115)
                        .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtDoc)))
                    .addGroup(pnlDadosCadastraisLayout.createSequentialGroup()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtData)))
                .addContainerGap())
        );
        pnlDadosCadastraisLayout.setVerticalGroup(
            pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCadastraisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoc)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnlTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Contatos"));

        btnNovoTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovoTel.setText("Novo");
        btnNovoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTelActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email:");

        javax.swing.GroupLayout pnlTelefoneLayout = new javax.swing.GroupLayout(pnlTelefone);
        pnlTelefone.setLayout(pnlTelefoneLayout);
        pnlTelefoneLayout.setHorizontalGroup(
            pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail))
                .addGroup(pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelefoneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtEmail))
                    .addGroup(pnlTelefoneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTelefoneLayout.setVerticalGroup(
            pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelefoneLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(btnNovoTel)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pnlLocalizacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização"));

        lblComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        lblUF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUF.setText("UF:");

        cbxUF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione UF", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));

        btnNovoTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovoTel1.setText("Novo");

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumero.setText("Numero:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBairro.setText("Bairro:");

        txtCidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        txtComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlLocalizacaoLayout = new javax.swing.GroupLayout(pnlLocalizacao);
        pnlLocalizacao.setLayout(pnlLocalizacaoLayout);
        pnlLocalizacaoLayout.setHorizontalGroup(
            pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero)
                    .addComponent(lblBairro)
                    .addComponent(lblUF))
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEndereco))
                    .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovoTel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLocalizacaoLayout.createSequentialGroup()
                                        .addComponent(lblComplemento)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        pnlLocalizacaoLayout.setVerticalGroup(
            pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlLocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUF)
                            .addComponent(btnNovoTel1)))
                    .addGroup(pnlLocalizacaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxUF)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291)
                        .addComponent(pnlTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDadosCadastrais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addComponent(pnlDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        setSize(new java.awt.Dimension(720, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void rdbPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPJActionPerformed
        // TODO add your handling code here:

        try {

            this.txtDoc.setValue(null);
            this.txtData.setValue(null);
            cnpjMask = new MaskFormatter("##.###.###/####-##");

            this.lblNome.setText("Razão Social:");
            this.lblDoc.setText("CNPJ:");
            this.lblData.setText("Data de Abertura:");
            this.txtDoc.setFormatterFactory(new DefaultFormatterFactory(cnpjMask));

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_rdbPJActionPerformed

    private void rdbPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPFActionPerformed
        // TODO add your handling code here:

        try {
            this.txtDoc.setValue(null);
            this.txtData.setValue(null);
            cpfMask = new MaskFormatter("###.###.###-##");

            this.lblNome.setText("Nome:");
            this.lblDoc.setText("CPF:");
            this.lblData.setText("Data de Nascimento:");
            this.txtDoc.setFormatterFactory(new DefaultFormatterFactory(cpfMask));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_rdbPFActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        Cliente c = new Cliente();

        c.setDocumento(txtDoc.getText());
        String data = txtData.getText();
        c.setDtnascimento(Date.valueOf(data));
        c.setNomerazao(txtNome.getText());
        c.setEmail(txtEmail.getText());
        c.setSexo("S");
        c.setIdusuario(this.idusuario);

        if (rdbPF.isSelected()) {
            c.setTipodocumento("F");
        } else if (rdbPJ.isSelected()) {
            c.setTipodocumento("J");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Deve-se selecionar o Tipo Pessoa!");
            return;
        }

        int idcliente = ClienteControle.Inserir(c);

        if (idcliente > 0) {
            Telefone t = new Telefone();

            String telefone = txtTelefone.getText();

            telefone = telefone.replace("(", "");
            telefone = telefone.replace(")", "");
            telefone = telefone.replace(" ", "");

            t.setDdd(telefone.substring(0, 2));
            t.setTelefone(telefone.substring(2, 12));
            t.setIdcliente(idcliente);

            Boolean salvoutel = TelefoneControle.Inserir(t);

            if (salvoutel) {

                Endereco e = new Endereco();
                e.setLogradouro(txtEndereco.getText());
                e.setNumero(txtNumero.getText());
                e.setComplemento(txtComplemento.getText());
                e.setBairro(txtBairro.getText());
                e.setCidade(txtCidade.getText());
                e.setUf((String) cbxUF.getSelectedItem());
                e.setIdcliente(idcliente);

                Boolean salvouend = EnderecoControle.Inserir(e);

                if (salvouend) {
                    JOptionPane.showMessageDialog(null,
                            "Cadastro Efetuado com Sucesso");

                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Não Salvou o Endereço do Cliente!");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Não Salvou o Telefone do Cliente!");
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Não Salvou o Cliente!");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:

        Cliente c = ClienteControle.Procurar(
                Integer.parseInt(this.txtID.getText()));

        if (c == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        } else {
            this.txtDoc.setText(c.getDocumento());
            this.txtData.setText(c.getDtnascimento()
                    .toString());
            this.txtNome.setText(c.getNomerazao());
            this.txtEmail.setText(c.getEmail());

            if (c.getTipodocumento().equals("F")) {

                this.rdbPF.setSelected(true);
                this.lblNome.setText("Nome:");
                this.lblDoc.setText("CPF:");
                this.lblData.setText("Data de Nascimento:");

            } else {

                this.rdbPJ.setSelected(true);
                this.lblNome.setText("Razão Social:");
                this.lblDoc.setText("CNPJ:");
                this.lblData.setText("Data de Abertura:");
            }
        }
    }//GEN-LAST:event_txtIDFocusLost

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:

        Cliente c = ClienteControle.Procurar(
                Integer.parseInt(this.txtID.getText()));

        if (c == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        } else {
            this.txtDoc.setText(c.getDocumento());
            this.txtData.setText(c.getDtnascimento()
                    .toString());
            this.txtNome.setText(c.getNomerazao());
            this.txtEmail.setText(c.getEmail());

            if (c.getTipodocumento().equals("F")) {

                this.rdbPF.setSelected(true);
                this.lblNome.setText("Nome:");
                this.lblDoc.setText("CPF:");
                this.lblData.setText("Data de Nascimento:");

            } else {

                this.rdbPJ.setSelected(true);
                this.lblNome.setText("Razão Social:");
                this.lblDoc.setText("CNPJ:");
                this.lblData.setText("Data de Abertura:");
            }
        }

    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnNovoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTelActionPerformed
        // TODO add your handling code here:

        formTelefone formTel = new formTelefone();
        formTel.setVisible(true);
    }//GEN-LAST:event_btnNovoTelActionPerformed

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
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoTel;
    private javax.swing.JButton btnNovoTel1;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.ButtonGroup gruporadio;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDoc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel pnlDadosCadastrais;
    private javax.swing.JPanel pnlLocalizacao;
    private javax.swing.JPanel pnlTelefone;
    private javax.swing.JPanel pnlTipoPessoa;
    private javax.swing.JRadioButton rdbPF;
    private javax.swing.JRadioButton rdbPJ;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDoc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}