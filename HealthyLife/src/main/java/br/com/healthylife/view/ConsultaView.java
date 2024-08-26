package br.com.healthylife.view;

import br.com.healthylife.controller.ConsultaController;
import br.com.healthylife.model.Consulta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ConsultaView extends javax.swing.JFrame {
    
    private static final boolean CANCELA_EDICAO = true;
    
    public ConsultaView() {
        initComponents();
        initElements();
    }
    
    public ConsultaView(boolean pesquisaDados) {
        initComponents();
        initElements();
        if(pesquisaDados) {
            ActionEvent evt = null;
            btnPesquisarActionPerformed(evt);
        }
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
        lblNomeConsulta = new javax.swing.JLabel();
        crlTable = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnAddPaciente = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        btnMaisFiltros = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscaPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBuscaProfissional = new javax.swing.JTextField();
        btnMenosFiltro = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblSim = new javax.swing.JLabel();
        txtBuscaData = new javax.swing.JTextField();
        txtBuscaHorario = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        sprData = new javax.swing.JSeparator();
        sprHorario = new javax.swing.JSeparator();
        lblMsgErro = new javax.swing.JLabel();
        lblOu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(839, 560));
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
        btnNovoLogin.setForeground(new java.awt.Color(0, 255, 102));
        btnNovoLogin.setText("Novo Login");
        btnNovoLogin.setToolTipText("Novo Login");
        btnNovoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLoginActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNovoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        btnConsulta.setBackground(new java.awt.Color(0, 255, 102));
        btnConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsulta.setText("Consulta");
        btnConsulta.setToolTipText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(0, 255, 102));
        btnPaciente.setText("Paciente");
        btnPaciente.setToolTipText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        btnProfissional.setBackground(new java.awt.Color(255, 255, 255));
        btnProfissional.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfissional.setForeground(new java.awt.Color(0, 255, 102));
        btnProfissional.setText("Profissional");
        btnProfissional.setToolTipText("Profissional");
        btnProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfissionalActionPerformed(evt);
            }
        });
        pnlMenu.add(btnProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        btnRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(0, 255, 102));
        btnRelatorio.setText("Relatório");
        btnRelatorio.setToolTipText("Ajuda");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        pnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 191, 620));

        lblNomeConsulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeConsulta.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeConsulta.setText("Listagem de consultas");
        lblNomeConsulta.setToolTipText("Nome usuário");
        pnlPrincipal.add(lblNomeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        tblDados.setBackground(new java.awt.Color(255, 255, 255));
        tblDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Data", "Horário", "Local", "Primeira consulta", "Cliente", "Profissional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDados.setToolTipText("Consultas agendadas");
        tblDados.setFocusable(false);
        tblDados.getTableHeader().setReorderingAllowed(false);
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDadosMouseClicked(evt);
            }
        });
        crlTable.setViewportView(tblDados);

        pnlPrincipal.add(crlTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 700, 390));

        btnAddPaciente.setBackground(new java.awt.Color(0, 255, 102));
        btnAddPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPaciente.setText("+   Agendar consulta");
        btnAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPacienteActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAddPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 170, 30));

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 40, 40));

        btnExcluir.setBackground(new java.awt.Color(0, 255, 102));
        btnExcluir.setToolTipText("Finalizar");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 40, 40));

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        lblPesquisa.setText("Pesquisar paciente:");
        pnlCentral.add(lblPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        btnMaisFiltros.setBackground(new java.awt.Color(255, 255, 255));
        btnMaisFiltros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaisFiltros.setForeground(new java.awt.Color(0, 255, 102));
        btnMaisFiltros.setText("| Mais filtros |");
        btnMaisFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisFiltrosActionPerformed(evt);
            }
        });
        pnlCentral.add(btnMaisFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ou");
        pnlCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtBuscaPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaPaciente.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaPaciente.setToolTipText(" nome cliente");
        txtBuscaPaciente.setBorder(null);
        txtBuscaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaPacienteMouseClicked(evt);
            }
        });
        txtBuscaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaPacienteKeyReleased(evt);
            }
        });
        pnlCentral.add(txtBuscaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 410, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pesquisar profissional:");
        pnlCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        txtBuscaProfissional.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaProfissional.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaProfissional.setToolTipText("nome profissional");
        txtBuscaProfissional.setBorder(null);
        txtBuscaProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaProfissionalMouseClicked(evt);
            }
        });
        txtBuscaProfissional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaProfissionalKeyReleased(evt);
            }
        });
        pnlCentral.add(txtBuscaProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 360, 30));

        btnMenosFiltro.setBackground(new java.awt.Color(255, 255, 255));
        btnMenosFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMenosFiltro.setForeground(new java.awt.Color(0, 255, 51));
        btnMenosFiltro.setText("| Menos filtros |");
        btnMenosFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFiltroActionPerformed(evt);
            }
        });
        pnlCentral.add(btnMenosFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 120, 30));

        btnPesquisar.setBackground(new java.awt.Color(0, 255, 102));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnlCentral.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 130, -1));

        pnlPrincipal.add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 730, 100));

        lblSim.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(lblSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 46, 160, 30));

        txtBuscaData.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaData.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaData.setToolTipText("informe a data");
        txtBuscaData.setBorder(null);
        txtBuscaData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaDataMouseClicked(evt);
            }
        });
        txtBuscaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaDataKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 30));

        txtBuscaHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaHorario.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaHorario.setToolTipText("informe o horário");
        txtBuscaHorario.setBorder(null);
        txtBuscaHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaHorarioMouseClicked(evt);
            }
        });
        txtBuscaHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaHorarioKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscaHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, 30));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setText("Data:");
        pnlPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 30));

        lblHorario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(0, 0, 0));
        lblHorario.setText("Horário:");
        pnlPrincipal.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 30));

        sprData.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, -1));

        sprHorario.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 120, -1));

        lblMsgErro.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblMsgErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 330, 30));

        lblOu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOu.setForeground(new java.awt.Color(0, 0, 0));
        lblOu.setText("ou");
        pnlPrincipal.add(lblOu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMouseClicked
    }//GEN-LAST:event_tblDadosMouseClicked

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        PacienteView telaPaciente = new PacienteView();
        telaPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfissionalActionPerformed
        ProfissionalView telaProfissional = new ProfissionalView();
        telaProfissional.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProfissionalActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio telaRelaorio = new Relatorio((JFrame) this);
        telaRelaorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnNovoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoginActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoLoginActionPerformed

    private void btnAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPacienteActionPerformed
        AgendarConsulta telaConsulta = new AgendarConsulta();
        telaConsulta.setVisible(true);
    }//GEN-LAST:event_btnAddPacienteActionPerformed

    private void btnMaisFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisFiltrosActionPerformed
        txtBuscaData.setVisible(true);
        lblData.setVisible(true);
        sprData.setVisible(true);
        
        lblOu.setVisible(true);
        txtBuscaHorario.setVisible(true);
        lblHorario.setVisible(true);
        sprHorario.setVisible(true);
        
        btnMaisFiltros.setVisible(false);
        btnMenosFiltro.setVisible(true);
    }//GEN-LAST:event_btnMaisFiltrosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ConsultaController controller = new ConsultaController();
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String id = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                
                int comfirme = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar esta consulta?");
                
                if(comfirme == 0) {
                    Consulta c = controller.obterConsultaController(Integer.parseInt(id));
                    
                    controller.excluirConsultaController(c);
                    JOptionPane.showMessageDialog(null, "Consulta finalizada com sucesso!", "Finalizar consulta", 0);
                    btnPesquisarActionPerformed(evt);
                    tblDados.clearSelection();
                    
                } else if(comfirme == 1 || comfirme == 2) {
                    tblDados.clearSelection();
                }
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Selecione o registro da tabela corretamente", "ATENÇÃO", 0);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        boolean checkHorario;
        ConsultaController controller = new ConsultaController();
        
        try {
            if(txtBuscaHorario.getText().length() > 0) {
                checkHorario = controller.validHorario(txtBuscaHorario.getText());
                if(checkHorario) {
                    List<Consulta> consultas = controller.buscarConsultaController(txtBuscaData.getText(), 
                        txtBuscaHorario.getText(), txtBuscaPaciente.getText(), 
                        txtBuscaProfissional.getText());
                    preencheTable(consultas);
                } else {
                    lblMsgErro.setText("Horário inválido! Forma correta 00:00");
                    Border border = BorderFactory.createLineBorder(Color.red);
                    txtBuscaHorario.setBorder(border);
                }
            } else {
                List<Consulta> consultas = controller.buscarConsultaController(txtBuscaData.getText(), 
                        txtBuscaHorario.getText(), txtBuscaPaciente.getText(), 
                        txtBuscaProfissional.getText());
                    preencheTable(consultas);
            }
        } 
        catch(Exception e) {
            lblMsgErro.setText("Data inválido! Forma correta 00/00/0000");
            Border border = BorderFactory.createLineBorder(Color.red);
            txtBuscaData.setBorder(border);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtBuscaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaPacienteMouseClicked
        txtBuscaPaciente.setText("");
    }//GEN-LAST:event_txtBuscaPacienteMouseClicked

    private void txtBuscaProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaProfissionalMouseClicked
        txtBuscaProfissional.setText("");
    }//GEN-LAST:event_txtBuscaProfissionalMouseClicked

    private void btnMenosFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFiltroActionPerformed
        txtBuscaData.setVisible(false);
        lblData.setVisible(false);
        sprData.setVisible(false);
        
        lblOu.setVisible(false);
        txtBuscaHorario.setVisible(false);
        lblHorario.setVisible(false);
        sprHorario.setVisible(false);
        
        btnMaisFiltros.setVisible(true);
        btnMenosFiltro.setVisible(false);
    }//GEN-LAST:event_btnMenosFiltroActionPerformed

    private void txtBuscaPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPacienteKeyReleased
        lblMsgErro.setText("");
        
        /**
         * Caso esteja com algum erro, a marcação em vermelho do compo com entrada incorreta, ficará branca novamente
         */
        Border border = BorderFactory.createLineBorder(Color.white);
        txtBuscaHorario.setBorder(border);
        
        Border bordeOne = BorderFactory.createLineBorder(Color.white);
        txtBuscaData.setBorder(border);
    }//GEN-LAST:event_txtBuscaPacienteKeyReleased

    private void txtBuscaProfissionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProfissionalKeyReleased
        lblMsgErro.setText("");
        
        /**
         * Caso esteja com algum erro, a marcação em vermelho do compo com entrada incorreta, ficará branca novamente
         */
        Border border = BorderFactory.createLineBorder(Color.white);
        txtBuscaHorario.setBorder(border);
        
        Border bordeOne = BorderFactory.createLineBorder(Color.white);
        txtBuscaData.setBorder(border);
    }//GEN-LAST:event_txtBuscaProfissionalKeyReleased

    private void txtBuscaDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaDataKeyReleased
        lblMsgErro.setText("");
        
        /**
         * Caso esteja com algum erro, a marcação em vermelho do compo com entrada incorreta, ficará branca novamente
         */
        Border border = BorderFactory.createLineBorder(Color.white);
        txtBuscaHorario.setBorder(border);
        
        Border bordeOne = BorderFactory.createLineBorder(Color.white);
        txtBuscaData.setBorder(border);
    }//GEN-LAST:event_txtBuscaDataKeyReleased

    private void txtBuscaHorarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaHorarioKeyReleased
        lblMsgErro.setText("");
        
        /**
         * Caso esteja com algum erro, a marcação em vermelho do compo com entrada incorreta, ficará branca novamente
         */
        Border border = BorderFactory.createLineBorder(Color.white);
        txtBuscaHorario.setBorder(border);
        
        Border bordeOne = BorderFactory.createLineBorder(Color.white);
        txtBuscaData.setBorder(border);
    }//GEN-LAST:event_txtBuscaHorarioKeyReleased

    private void txtBuscaDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaDataMouseClicked
        txtBuscaData.setText("");
    }//GEN-LAST:event_txtBuscaDataMouseClicked

    private void txtBuscaHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaHorarioMouseClicked
        txtBuscaHorario.setText("");
    }//GEN-LAST:event_txtBuscaHorarioMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ConsultaController controller = new ConsultaController();
        AgendarConsulta agendarConsulta = new AgendarConsulta(CANCELA_EDICAO);
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String id = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                Consulta consultaSelecionada = controller.obterConsultaController(Integer.parseInt(id));
                agendarConsulta.preencheEdicao(consultaSelecionada);
                agendarConsulta.setVisible(true);
                this.dispose();
            }
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPaciente;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMaisFiltros;
    private javax.swing.JButton btnMenosFiltro;
    private javax.swing.JButton btnNovoLogin;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProfissional;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JScrollPane crlTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMsgErro;
    public static javax.swing.JLabel lblNomeConsulta;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblSim;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprData;
    private javax.swing.JSeparator sprHorario;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscaData;
    private javax.swing.JTextField txtBuscaHorario;
    private javax.swing.JTextField txtBuscaPaciente;
    private javax.swing.JTextField txtBuscaProfissional;
    // End of variables declaration//GEN-END:variables

    /**
     * Preenche a tabela com todos os dados buscado do Banco de Dados 
     * @param consultas 
     */
    public void preencheTable(List<Consulta> consultas) {
        String columns[] = {"Registro", "Data", "Horário", "Local", "Primeira consulta", "Cliente", "Profissional"};
        String dados[][] = new String[consultas.size()][columns.length];
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        int i = 0;
        for (Consulta c : consultas) {
            dados[i] = new String[]{
                String.valueOf(c.getIdConsulta()),
                c.getConsultaData().format(formatter),
                c.getConsultaHorario(),
                c.getConsultaTipo(),
                c.getPacientePrimeiraVez(),
                c.getCliente().getNome(),
                c.getProfissional().getNome()};
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(dados, columns);
        tblDados.setModel(tableModel);
    } 
    
    /**
     * Inicializa os elementos de busca com visibilidade falsa
     */
    public void initElements() {
        txtBuscaData.setVisible(false);
        lblData.setVisible(false);
        sprData.setVisible(false);
        txtBuscaHorario.setVisible(false);
        lblOu.setVisible(false);
        lblHorario.setVisible(false);
        sprHorario.setVisible(false);
        btnMenosFiltro.setVisible(false);
    }
}
