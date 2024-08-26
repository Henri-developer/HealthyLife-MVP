package br.com.healthylife.view;

import br.com.healthylife.controller.CadastroController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Cadastro extends javax.swing.JFrame {
    
    public Cadastro() {
        initComponents();
        JOptionPane.showMessageDialog(null, "ATENÇÃO! Sua senha deve conter pelo menos 1 letra maiúscula, 1 minúscula e 1 caracter especial");
    }
    
    /**
     * Limpando os compos após um cadastro realizado com sucesso 
     */
    public void limparCampos() {
        txtNome.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCadastroLogin = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        sprNome = new javax.swing.JSeparator();
        sprSenha = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        sprLogin = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        sprTelefone = new javax.swing.JSeparator();
        lblMsgCadastro = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        sprEmail = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCadastroLogin.setBackground(new java.awt.Color(0, 0, 153));
        pnlCadastroLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlLogin.setForeground(new java.awt.Color(204, 204, 204));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo4.setText("Crie sua conta");
        lblTitulo4.setToolTipText("Cadastro");
        pnlLogin.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btnCadastro.setBackground(new java.awt.Color(0, 0, 153));
        btnCadastro.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("CADASTRAR");
        btnCadastro.setToolTipText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlLogin.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 220, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setToolTipText("Nome");
        txtNome.setBorder(null);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        pnlLogin.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 30));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setToolTipText("Senha");
        txtSenha.setBorder(null);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        pnlLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome");
        pnlLogin.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, -1));

        lblSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setLabelFor(txtSenha);
        lblSenha.setText("Senha");
        pnlLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 50, -1));

        sprNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 10));

        sprSenha.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 10));

        lblLogin.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setLabelFor(txtLogin);
        lblLogin.setText("Login");
        pnlLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        txtLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtLogin.setToolTipText("Nome de acesso");
        txtLogin.setBorder(null);
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoginKeyReleased(evt);
            }
        });
        pnlLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));

        sprLogin.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setLabelFor(txtEmail);
        lblEmail.setText("Email");
        pnlLogin.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("Email");
        txtEmail.setBorder(null);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        pnlLogin.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 30));

        sprTelefone.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 10));

        lblMsgCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMsgCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblMsgCadastro.setToolTipText("");
        pnlLogin.add(lblMsgCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 210, 20));

        lblTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefone.setText("Telefone");
        pnlLogin.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(null);
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setToolTipText("Telefone");
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });
        pnlLogin.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 40));

        sprEmail.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, -1));

        pnlCadastroLogin.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 460, 450));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Nutri");
        pnlCadastroLogin.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Century Gothic", 2, 36)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setText("Web");
        pnlCadastroLogin.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lblTitulo3.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("Bem-Vindo");
        pnlCadastroLogin.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 153));
        btnLogin.setText("ENTRAR");
        btnLogin.setToolTipText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlCadastroLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        pnlPrincipal.add(pnlCadastroLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        boolean check;
        CadastroController controller = new CadastroController();
        
        String nome = txtNome.getText();
        String senha = txtSenha.getText();
        String login = txtLogin.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();
        
        check = controller.checkFields(nome, senha, login, email, telefone);
        
        try {
            if(check == false) {
                JOptionPane.showMessageDialog(rootPane, "Cuidado! Preencha os campos corretamente", "ATENÇÃO", HEIGHT);
            } else {
                controller.cadastro(nome, senha, login, email, telefone);
                JOptionPane.showMessageDialog(null, "Sucesso! Cadastro realizado");
                limparCampos();
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Nome de login já existente!", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        lblMsgCadastro.setText("");
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        String senha = txtSenha.getText();
        
        if(senha.length() < 8) {
            lblMsgCadastro.setForeground(Color.RED);
            lblMsgCadastro.setText("Minímo de 8 caracteres");
        } else if(senha.length() < 12) {
            lblMsgCadastro.setForeground(Color.ORANGE);
            lblMsgCadastro.setText("Senha forte");
        } else if(senha.length() < 16) {
            lblMsgCadastro.setForeground(Color.GREEN);
            lblMsgCadastro.setText("Senha muito forte");
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyReleased
        lblMsgCadastro.setText("");
    }//GEN-LAST:event_txtLoginKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        lblMsgCadastro.setText("");
        
        boolean checkEmail;
        CadastroController controller = new CadastroController();
        
        checkEmail = controller.checkEmail(txtEmail.getText());
        
        if(checkEmail == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtEmail.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtEmail.setBorder(border);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        boolean checkTelefone;
        CadastroController controller = new CadastroController();
        
        checkTelefone = controller.checkTelefone(txtTelefone.getText());
        
        if(checkTelefone == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtTelefone.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtTelefone.setBorder(border);
        }
    }//GEN-LAST:event_txtTelefoneKeyReleased

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    public static javax.swing.JLabel lblMsgCadastro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JPanel pnlCadastroLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprEmail;
    private javax.swing.JSeparator sprLogin;
    private javax.swing.JSeparator sprNome;
    private javax.swing.JSeparator sprSenha;
    private javax.swing.JSeparator sprTelefone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
