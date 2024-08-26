package br.com.healthylife.view;

import br.com.healthylife.controller.LoginController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCadastroLogin = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        sprNome = new javax.swing.JSeparator();
        sprSenha = new javax.swing.JSeparator();
        lblMsgErro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        lblTitulo5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pnlCadastroLogin.setBackground(new java.awt.Color(0, 0, 153));
        pnlCadastroLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlLogin.setForeground(new java.awt.Color(204, 204, 204));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo4.setText("Login");
        lblTitulo4.setToolTipText("Login");
        pnlLogin.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 29, -1, -1));

        btnLogin.setBackground(new java.awt.Color(0, 0, 153));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ENTRAR");
        btnLogin.setToolTipText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 210, -1));

        txtLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtLogin.setToolTipText("Nome de acesso");
        txtLogin.setBorder(null);
        txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLoginMouseClicked(evt);
            }
        });
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoginKeyReleased(evt);
            }
        });
        pnlLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setToolTipText("Senha");
        txtSenha.setBorder(null);
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        pnlLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 200, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setLabelFor(txtLogin);
        lblNome.setText("Login");
        pnlLogin.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        lblSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setLabelFor(txtSenha);
        lblSenha.setText("Senha");
        lblSenha.setToolTipText("");
        pnlLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 50, -1));

        sprNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, -1));

        sprSenha.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(sprSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, -1));

        lblMsgErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMsgErro.setForeground(new java.awt.Color(255, 0, 0));
        lblMsgErro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlLogin.add(lblMsgErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 210, 30));

        pnlCadastroLogin.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 410, 410));

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

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 153));
        btnCadastro.setText("CADASTRAR");
        btnCadastro.setToolTipText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlCadastroLogin.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, -1));

        lblTitulo5.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setText("de volta");
        pnlCadastroLogin.add(lblTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(pnlCadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(pnlCadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean resultLogin;
        int chckField = 0;
        LoginController controller = new LoginController();
        
        chckField = controller.checkFields(txtLogin.getText(), txtSenha.getText());
        
        try {
            if(chckField == 1) {
                Border border = BorderFactory.createLineBorder(Color.RED);
                txtLogin.setBorder(border);
            } 
            else if(chckField == 2) {
                Border border = BorderFactory.createLineBorder(Color.RED);
                txtSenha.setBorder(border);
            } 
            else {
                resultLogin = controller.checkLogin(txtLogin.getText(), txtSenha.getText());
                if(resultLogin) {
                    JOptionPane.showMessageDialog(null, "Olá, "  + txtLogin.getText() + "! seja bem-vindo ao NutriWeb");
                    
                    ConsultaView consultaView = new ConsultaView();
                    consultaView.setVisible(true);
                    this.setVisible(false);
                }
            }
        } 
        catch(Exception e) {
            lblMsgErro.setText("Usuário ou Senha incorreto!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyReleased
        this.lblMsgErro.setText("");
    }//GEN-LAST:event_txtLoginKeyReleased

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        this.lblMsgErro.setText("");
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseClicked
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        txtLogin.setBorder(border);
    }//GEN-LAST:event_txtLoginMouseClicked

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        txtSenha.setBorder(border);
    }//GEN-LAST:event_txtSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblMsgErro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JPanel pnlCadastroLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprNome;
    private javax.swing.JSeparator sprSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
