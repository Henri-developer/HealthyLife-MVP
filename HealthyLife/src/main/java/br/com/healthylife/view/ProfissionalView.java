package br.com.healthylife.view;

import br.com.healthylife.controller.ProfissionalController;
import br.com.healthylife.model.Profissional;
import jakarta.persistence.EntityNotFoundException;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ProfissionalView extends javax.swing.JFrame {
    
    private JFrame consulta;
    private Profissional profissionalEdicao = null;

    public ProfissionalView() {
        initComponents();
        initElements();
    }
    
    public ProfissionalView(JFrame consulta) {
        this.consulta = consulta;
        initComponents();
        initElements();
    }
    
    /**
     * Preenche os campos com o Profissional selecionado da tabela 
     * @param p 
     */
    public void preencheEdicao(Profissional p) {
        txtNome.setText(p.getNome());
        txtEspecialidade.setText(p.getEspecialidade());
        profissionalEdicao = p;
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
        crlTable = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        pnlPesquisa = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEspecialidade = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        sprNome = new javax.swing.JSeparator();
        sprEspecialidade = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnMaisFiltro = new javax.swing.JButton();
        btnMenosFiltro = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();
        lblNomes = new javax.swing.JLabel();
        sprEspecialidadeBusca = new javax.swing.JSeparator();
        lblMsgProfissional = new javax.swing.JLabel();
        lblOu = new javax.swing.JLabel();
        sprNomeBusca = new javax.swing.JSeparator();
        txtBuscaEspecialidade = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblEspecialidades = new javax.swing.JLabel();

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

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(51, 255, 102));
        btnPaciente.setText("Paciente");
        btnPaciente.setToolTipText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        btnProfissional.setBackground(new java.awt.Color(0, 255, 102));
        btnProfissional.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfissional.setForeground(new java.awt.Color(255, 255, 255));
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

        pnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 173, 620));

        tblDados.setBackground(new java.awt.Color(255, 255, 255));
        tblDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Especialidade"
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
        tblDados.setToolTipText("Dados Profissional");
        tblDados.setFocusable(false);
        tblDados.getTableHeader().setReorderingAllowed(false);
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDadosMouseClicked(evt);
            }
        });
        crlTable.setViewportView(tblDados);

        pnlPrincipal.add(crlTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 600, 400));

        pnlPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        pnlPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");
        pnlPesquisa.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 28));

        btnSalvar.setBackground(new java.awt.Color(0, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de profissional");
        pnlPesquisa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        pnlPesquisa.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 30));

        lblEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        lblEspecialidade.setText("Especialidade:");
        pnlPesquisa.add(lblEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        txtEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecialidade.setBorder(null);
        txtEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEspecialidadeMouseClicked(evt);
            }
        });
        pnlPesquisa.add(txtEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, 30));

        sprNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlPesquisa.add(sprNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, -1));

        sprEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        pnlPesquisa.add(sprEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        pnlPesquisa.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 630, 10));

        btnMaisFiltro.setBackground(new java.awt.Color(255, 255, 255));
        btnMaisFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaisFiltro.setForeground(new java.awt.Color(0, 255, 102));
        btnMaisFiltro.setText("| Pesquisar | ");
        btnMaisFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisFiltroActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnMaisFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 120, -1));

        btnMenosFiltro.setBackground(new java.awt.Color(255, 255, 255));
        btnMenosFiltro.setForeground(new java.awt.Color(0, 255, 102));
        btnMenosFiltro.setText("| Menos filtro |");
        btnMenosFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFiltroActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnMenosFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 120, -1));

        pnlPrincipal.add(pnlPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 650, 130));

        txtBuscaNome.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaNome.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaNome.setToolTipText("Buscar profissional");
        txtBuscaNome.setBorder(null);
        txtBuscaNome.setNextFocusableComponent(btnNovoLogin);
        txtBuscaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaNomeMouseClicked(evt);
            }
        });
        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 28));

        lblNomes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomes.setForeground(new java.awt.Color(0, 0, 0));
        lblNomes.setText("Nome:");
        pnlPrincipal.add(lblNomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 50));

        sprEspecialidadeBusca.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprEspecialidadeBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 140, 10));
        pnlPrincipal.add(lblMsgProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 630, 20));

        lblOu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOu.setForeground(new java.awt.Color(0, 0, 0));
        lblOu.setText("ou");
        pnlPrincipal.add(lblOu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        sprNomeBusca.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprNomeBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 120, 10));

        txtBuscaEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaEspecialidade.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaEspecialidade.setToolTipText("Buscar por especialidade");
        txtBuscaEspecialidade.setBorder(null);
        txtBuscaEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaEspecialidadeMouseClicked(evt);
            }
        });
        txtBuscaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaEspecialidadeActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtBuscaEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 140, 30));

        btnPesquisar.setBackground(new java.awt.Color(0, 255, 102));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 110, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 40, 40));

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 40, 40));

        lblEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        lblEspecialidades.setText("Especialidade:");
        pnlPrincipal.add(lblEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMouseClicked
    }//GEN-LAST:event_tblDadosMouseClicked

    private void btnProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfissionalActionPerformed
    }//GEN-LAST:event_btnProfissionalActionPerformed

    private void btnNovoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoginActionPerformed
        Cadastro cadastro = new Cadastro(); 
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoLoginActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        ConsultaView telaConsulta = new ConsultaView();
        telaConsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        PacienteView telaPaciente = new PacienteView();
        telaPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio relatorio = new Relatorio((JFrame) this);
        relatorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void txtBuscaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaNomeMouseClicked
        this.txtBuscaNome.setText("");
    }//GEN-LAST:event_txtBuscaNomeMouseClicked

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
    }//GEN-LAST:event_txtBuscaNomeKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int checkField = 0;
        ProfissionalController controller = new ProfissionalController();
        
        String nome = txtNome.getText();
        String especialidade = txtEspecialidade.getText(); 
        
        Profissional novoProfissional = new Profissional();
        if(profissionalEdicao != null) {
            novoProfissional = profissionalEdicao;
        }
        
        try {
           checkField = controller.resultProfissional(nome, especialidade);
            if(checkField == 1) {
                Border border = BorderFactory.createLineBorder(Color.RED);
                txtNome.setBorder(border);
            } 
            else if(checkField == 2) {
                Border border = BorderFactory.createLineBorder(Color.RED);
                txtEspecialidade.setBorder(border);
            } 
            else {
                if(profissionalEdicao == null) {
                    controller.cadastrarProfissional(nome, especialidade);
                    JOptionPane.showMessageDialog(null, "Sucesso! Profissional cadastrado.");
                } 
                else {
                    novoProfissional.setNome(nome);
                    novoProfissional.setEspecialidade(especialidade);
                    
                    controller.atualizarProfissionalController(novoProfissional);
                    JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!", "Edição", HEIGHT);
                }
                /**
                 * profissionalEdicao volta a ser nulo
                 */
                profissionalEdicao = null;
                btnPesquisarActionPerformed(evt);
                limparCampos();
            }
        } catch(EntityNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar profissional! Verifique os campos.", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        consulta.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        txtNome.setBorder(border);
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEspecialidadeMouseClicked
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        txtEspecialidade.setBorder(border);
    }//GEN-LAST:event_txtEspecialidadeMouseClicked

    private void txtBuscaEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaEspecialidadeMouseClicked
        txtBuscaEspecialidade.setText("");
    }//GEN-LAST:event_txtBuscaEspecialidadeMouseClicked

    private void txtBuscaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaEspecialidadeActionPerformed
    }//GEN-LAST:event_txtBuscaEspecialidadeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ProfissionalController controller = new ProfissionalController();
        
        try {
            List<Profissional> profissionais = controller.buscarProfissionalController(txtBuscaNome.getText(), 
                    txtBuscaEspecialidade.getText());
            preencheTable(profissionais);
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Preencha os campos de busca corretamente", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ProfissionalController controller = new ProfissionalController();
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String i = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                
                int comfirme = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir este registro?");
                
                if(comfirme == 0) {
                    Profissional p = controller.obterProfissionalController(Integer.parseInt(i));
                    
                    controller.excluirProfissionalController(p);
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!", "Exclusão de dados", 0);
                    btnPesquisarActionPerformed(evt);
                    tblDados.clearSelection();
                    
                } else if(comfirme == 1 || comfirme == 2) {
                    tblDados.clearSelection();
                }
            } 
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Selecione o registro da tabela corretamente", "ATENÇÃO", 0);
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnMaisFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisFiltroActionPerformed
        txtBuscaNome.setVisible(true);
        lblNomes.setVisible(true);
        sprNomeBusca.setVisible(true);
        
        lblOu.setVisible(true);
        
        txtBuscaEspecialidade.setVisible(true);
        lblEspecialidades.setVisible(true);
        sprEspecialidadeBusca.setVisible(true);
        
        btnMenosFiltro.setVisible(true);
        btnMaisFiltro.setVisible(false);
    }//GEN-LAST:event_btnMaisFiltroActionPerformed

    private void btnMenosFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFiltroActionPerformed
        txtBuscaNome.setVisible(false);
        lblNomes.setVisible(false);
        sprNomeBusca.setVisible(false);
        
        lblOu.setVisible(false);
        
        txtBuscaEspecialidade.setVisible(false);
        lblEspecialidades.setVisible(false);
        sprEspecialidadeBusca.setVisible(false);
        
        btnMenosFiltro.setVisible(false);
        btnMaisFiltro.setVisible(true);
    }//GEN-LAST:event_btnMenosFiltroActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ProfissionalController controller = new ProfissionalController();
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String id = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                
                Profissional profissionalSelecionado = 
                        controller.obterProfissionalController(Integer.parseInt(id));
                preencheEdicao(profissionalSelecionado);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Selecione um profissional válido", "ATENÇÃO", HEIGHT);
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
            java.util.logging.Logger.getLogger(ProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProfissionalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMaisFiltro;
    private javax.swing.JButton btnMenosFiltro;
    private javax.swing.JButton btnNovoLogin;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProfissional;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane crlTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblEspecialidades;
    public static javax.swing.JLabel lblMsgProfissional;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomes;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprEspecialidade;
    private javax.swing.JSeparator sprEspecialidadeBusca;
    private javax.swing.JSeparator sprNome;
    private javax.swing.JSeparator sprNomeBusca;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscaEspecialidade;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    /**
     * Preenche a tabela com todos os dados buscado do Banco de Dados 
     * @param profissionais 
     */
    public void preencheTable(List<Profissional> profissionais) {
        String columns[] = {"Registro", "Nome", "Especialidade"};
        String dados[][] = new String[profissionais.size()][columns.length];
        
        int i = 0;
        for (Profissional p : profissionais) {
            dados[i] = new String[]{
                String.valueOf(p.getId()),
                p.getNome(),
                p.getEspecialidade()};
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(dados, columns);
        tblDados.setModel(tableModel);
    }
    
    /**
     * Lipando dados dos campos após um novo cadastro
     */
    public void limparCampos() {
        txtNome.setText("");
        txtEspecialidade.setText("");
    }
    
    /**
     * Inicializa os elementos de busca com visibilidade falsa
     */
    public void initElements() {
        txtBuscaNome.setVisible(false);
        lblNomes.setVisible(false);
        sprNomeBusca.setVisible(false);
        
        lblOu.setVisible(false);
        
        txtBuscaEspecialidade.setVisible(false);
        lblEspecialidades.setVisible(false);
        sprEspecialidadeBusca.setVisible(false);
    }
} 
