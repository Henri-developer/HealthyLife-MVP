package br.com.healthylife.view;

import br.com.healthylife.services.ConsultasServices;
import br.com.healthylife.services.PacientesServices;
import br.com.healthylife.services.ProfissionaisServices;
import javax.swing.JFrame;

public class Relatorio extends javax.swing.JFrame {
    
    private JFrame consulta;
    
    public Relatorio() {
        initComponents();
        initConsulta();
        initPacientes();
        initProfissionais();
    }
    
    public Relatorio(JFrame consulta) {
        initComponents();
        initConsulta();
        initPacientes();
        initProfissionais();
        this.consulta = consulta;
    }
    
    /**
     * Método contagem de consultas
     */
    public void initConsulta() {
        ConsultasServices consultasServices = new ConsultasServices();
        lblConsultasAgendadas.setText("Consultas agendadas: " + consultasServices.consultasAgendadasServices());
        lblConsultasFinalizadas.setText("Consultas finalizadas: " + consultasServices.consultasFinalizadasServices());
    }
    
    /**
     * Método contagem de pacientes 
     */
    public void initPacientes() {
        PacientesServices acientesServices = new PacientesServices();
        lblPacientesTotais.setText("Pacientes totais: " + acientesServices.pacientesTotaisServices());
    }
    
    /**
     * Método contagem de profissionais  
     */
    public void initProfissionais() {
        ProfissionaisServices profissionaisServices = new ProfissionaisServices();
        lblProfissionaisTotais.setText("Profissionais totais: " + profissionaisServices.profissionaisTotaisServices());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTituloConsulta = new javax.swing.JLabel();
        lblConsultasAgendadas = new javax.swing.JLabel();
        lblSim = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblConsultasFinalizadas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblPacientes = new javax.swing.JLabel();
        lblPacientesTotais = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblProfissional = new javax.swing.JLabel();
        lblProfissionaisTotais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloConsulta.setBackground(new java.awt.Color(0, 0, 0));
        lblTituloConsulta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloConsulta.setText("Sessões agendadas");
        pnlPrincipal.add(lblTituloConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lblConsultasAgendadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConsultasAgendadas.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblConsultasAgendadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 20));
        pnlPrincipal.add(lblSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 10));

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 10));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("AGENDAMENTOS E SESSÕES");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        lblConsultasFinalizadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConsultasFinalizadas.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblConsultasFinalizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 20));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        pnlPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 220));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 180, 10));

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        lblPacientes.setBackground(new java.awt.Color(0, 0, 0));
        lblPacientes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setText("Pacientes");

        lblPacientesTotais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPacientesTotais.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblPacientesTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPacientesTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, 220));

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        lblProfissional.setBackground(new java.awt.Color(0, 0, 0));
        lblProfissional.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblProfissional.setForeground(new java.awt.Color(255, 255, 255));
        lblProfissional.setText("Profissionais");

        lblProfissionaisTotais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProfissionaisTotais.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblProfissional))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblProfissionaisTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblProfissional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfissionaisTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 180, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        consulta.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JLabel lblConsultasAgendadas;
    public static javax.swing.JLabel lblConsultasFinalizadas;
    private javax.swing.JLabel lblPacientes;
    public static javax.swing.JLabel lblPacientesTotais;
    public static javax.swing.JLabel lblProfissionaisTotais;
    private javax.swing.JLabel lblProfissional;
    public static javax.swing.JLabel lblSim;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloConsulta;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
