package br.com.healthylife.view;

import br.com.healthylife.controller.ClienteController;
import br.com.healthylife.model.Cliente;
import jakarta.persistence.EntityNotFoundException;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class PacienteCadastro extends javax.swing.JFrame {
    
    private JFrame cadastro;
    private Cliente clienteEdicao = null;
    private static final boolean PESQUISA_DADOS = true;
    
    public PacienteCadastro() {
        initComponents();
        this.txtAdicionais.setVisible(false);
    }
    
    public PacienteCadastro(JFrame cadastro) {
        this.cadastro = cadastro;
        initComponents();
    }
    
    /**
     * Preenche os campos com o Cliente selecionado da tabela 
     * @param c 
     */
    public void preencheEdicao(Cliente c) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtNome.setText(c.getNome());
        txtEmail.setText(c.getEmail());
        txtTelefone.setText(c.getTelefone());
        txtNascimento.setText(c.getDataNascimento().format(formatter));
        txtCpf.setText(c.getCpf());
        for (int i = 0; i < cbbGenero.getItemCount(); i++) {
            if(cbbGenero.getItemAt(i).equals(c.getGenero())) {
                cbbGenero.setSelectedIndex(i);
            }
        }
        clienteEdicao = c;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();
        btnNovoLogin = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnProfissional = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        sprNome1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        sprTelefone = new javax.swing.JSeparator();
        lblInformacoesPessoais = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblNascimento = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        sprNascimento = new javax.swing.JSeparator();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        sprCpf = new javax.swing.JSeparator();
        lblGenero = new javax.swing.JLabel();
        cbbGenero = new javax.swing.JComboBox<>();
        sprGenero = new javax.swing.JSeparator();
        btnAdicionais = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdicionais = new javax.swing.JTextArea();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        sprEmail = new javax.swing.JSeparator();
        lblMsgPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Nutri Web");
        lblTitulo.setToolTipText("Nutri Web");
        pnlMenu.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblVersao.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(0, 0, 0));
        lblVersao.setText("v.01");
        lblVersao.setToolTipText("Versão");
        pnlMenu.add(lblVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        btnNovoLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovoLogin.setForeground(new java.awt.Color(51, 255, 102));
        btnNovoLogin.setText("Novo Login");
        btnNovoLogin.setToolTipText("Novo Login");
        btnNovoLogin.setNextFocusableComponent(btnConsulta);
        btnNovoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLoginActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNovoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        btnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(51, 255, 102));
        btnConsulta.setText("Consulta");
        btnConsulta.setToolTipText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        btnPaciente.setBackground(new java.awt.Color(0, 255, 102));
        btnPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnPaciente.setText("Paciente");
        btnPaciente.setToolTipText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        btnProfissional.setBackground(new java.awt.Color(255, 255, 255));
        btnProfissional.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfissional.setForeground(new java.awt.Color(51, 255, 102));
        btnProfissional.setText("Profissional");
        btnProfissional.setToolTipText("Profissional");
        btnProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfissionalActionPerformed(evt);
            }
        });
        pnlMenu.add(btnProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        btnRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(51, 255, 102));
        btnRelatorio.setText("Relatório");
        btnRelatorio.setToolTipText("Ajuda");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        pnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        btnSalvar.setBackground(new java.awt.Color(0, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 200, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");
        pnlPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 28));

        sprNome1.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 570, 20));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        pnlPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 570, 30));

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefone.setText("Telefone:");
        pnlPrincipal.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        sprTelefone.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 170, 20));

        lblInformacoesPessoais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInformacoesPessoais.setForeground(new java.awt.Color(0, 0, 0));
        lblInformacoesPessoais.setText("1. IMFORMAÇÕES PESSOAIS");
        pnlPrincipal.add(lblInformacoesPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, 30));

        lblNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(0, 0, 0));
        lblNascimento.setText("Data nascimento:");
        pnlPrincipal.add(lblNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        txtNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtNascimento.setBorder(null);
        txtNascimento.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNascimentoKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 190, 30));

        sprNascimento.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, 10));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setText("CPF:");
        pnlPrincipal.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(null);
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 170, 30));

        sprCpf.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 170, 10));

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 0, 0));
        lblGenero.setText("Gênero:");
        pnlPrincipal.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        cbbGenero.setBackground(new java.awt.Color(255, 255, 255));
        cbbGenero.setForeground(new java.awt.Color(0, 0, 0));
        cbbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        pnlPrincipal.add(cbbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 150, -1));

        sprGenero.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 150, 10));

        btnAdicionais.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionais.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionais.setText("2. ADICIONAIS");
        btnAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaisActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAdicionais, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 560, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        txtAdicionais.setBackground(new java.awt.Color(255, 255, 255));
        txtAdicionais.setColumns(20);
        txtAdicionais.setRows(5);
        txtAdicionais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAdicionais);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 540, 90));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");
        pnlPrincipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 30));

        sprEmail.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, 10));

        lblMsgPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMsgPaciente.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblMsgPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 540, 30));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 614));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfissionalActionPerformed
        ProfissionalView profissionalView = new ProfissionalView();
        profissionalView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProfissionalActionPerformed

    private void btnNovoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoginActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoLoginActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        ConsultaView consultaView = new ConsultaView();
        consultaView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio relatorio = new Relatorio((JFrame) this);
        relatorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ClienteController controller = new ClienteController();
        
        Cliente novoCliente = new Cliente();
        if(clienteEdicao != null) {
            novoCliente = clienteEdicao;
        }
        
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String cpf = txtCpf.getText();
        String telefone = txtTelefone.getText();
        String dataNascimento = txtNascimento.getText();
        String genero = (String) cbbGenero.getSelectedItem();
        
        boolean check = controller.checkFields(nome, email, cpf, telefone, dataNascimento);
        
        try {
            if(check == false) {
                JOptionPane.showMessageDialog(null, "Cuidado! Existe campos não preenchidos corretamente", "ATENÇÃO", HEIGHT);
            } else {
                if(clienteEdicao == null) {
                    controller.cadastrarCliente(nome, email, cpf, telefone, LocalDate.parse(txtNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), genero);
                    lblMsgPaciente.setForeground(Color.green);
                    JOptionPane.showMessageDialog(null, "Sucesso! Cadastro realizado");
                } else {
                    novoCliente.setNome(nome);
                    novoCliente.setEmail(email);
                    novoCliente.setCpf(cpf);
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    novoCliente.setDataNascimento(LocalDate.parse(dataNascimento, format));
                    novoCliente.setTelefone(telefone);
                    novoCliente.setGenero(genero);
                    
                    controller.atualizarClienteController(novoCliente);
                    PacienteView pacienteView = new PacienteView(PESQUISA_DADOS);
                    pacienteView.setVisible(true);
                    this.dispose();
                }
                /**
                 * clienteEdicao volta a ser nulo
                 */
                clienteEdicao = null;
                limparCampos();
            }
        } 
        catch(EntityNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente! Verifique os campos", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaisActionPerformed
        this.txtAdicionais.setVisible(true);
    }//GEN-LAST:event_btnAdicionaisActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        cadastro.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        boolean check;
        ClienteController controller = new ClienteController();
        
        check = controller.checkEmail(txtEmail.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtEmail.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtEmail.setBorder(border);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        boolean check;
        ClienteController controller = new ClienteController();
        
        check = controller.checkCpf(txtCpf.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtCpf.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtCpf.setBorder(border);
        }
    }//GEN-LAST:event_txtCpfKeyReleased

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        boolean check;
        ClienteController controller = new ClienteController();
        
        check = controller.checkTelefone(txtTelefone.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtTelefone.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtTelefone.setBorder(border);
        }
    }//GEN-LAST:event_txtTelefoneKeyReleased

    private void txtNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNascimentoKeyReleased
        boolean check;
        ClienteController controller = new ClienteController();
        
        check = controller.checkDataNascimento(txtNascimento.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtNascimento.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtNascimento.setBorder(border);
        }
    }//GEN-LAST:event_txtNascimentoKeyReleased

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
            java.util.logging.Logger.getLogger(PacienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionais;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnNovoLogin;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProfissional;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbbGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblInformacoesPessoais;
    public static javax.swing.JLabel lblMsgPaciente;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprCpf;
    private javax.swing.JSeparator sprEmail;
    private javax.swing.JSeparator sprGenero;
    private javax.swing.JSeparator sprNascimento;
    private javax.swing.JSeparator sprNome1;
    private javax.swing.JSeparator sprTelefone;
    private javax.swing.JTextArea txtAdicionais;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /**
     * Lipando dados dos campos após um novo cadastro
     */
    public void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtNascimento.setText("");
        txtCpf.setText("");
    }
}
