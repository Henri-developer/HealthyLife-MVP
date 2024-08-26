package br.com.healthylife.view;

import br.com.healthylife.controller.ClienteController;
import br.com.healthylife.model.Cliente;
import jakarta.persistence.EntityNotFoundException;
import java.awt.event.ActionEvent;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteView extends javax.swing.JFrame {

    public PacienteView() {
        initComponents();
        initElements();
    }
    
    public PacienteView(boolean pesquisaDados) {
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
        crlTable = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnAddPaciente = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        pnlPesquisa = new javax.swing.JPanel();
        lblTituloTable = new javax.swing.JLabel();
        txtNomeBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnBuscasAvancadas = new javax.swing.JButton();
        btnMenosFiltro = new javax.swing.JButton();
        lblMsgErro = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtBuscaCpf = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        sprData = new javax.swing.JSeparator();
        lblOu = new javax.swing.JLabel();
        sprCpf = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nutri Web");
        setResizable(false);

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

        pnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 173, 620));

        tblDados.setBackground(new java.awt.Color(255, 255, 255));
        tblDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Email", "Telefone", "Data de Nascimento", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDados.setToolTipText("Dados Paciente");
        tblDados.setFocusable(false);
        tblDados.getTableHeader().setReorderingAllowed(false);
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDadosMouseClicked(evt);
            }
        });
        crlTable.setViewportView(tblDados);

        pnlPrincipal.add(crlTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 590, 450));

        btnAddPaciente.setBackground(new java.awt.Color(0, 255, 102));
        btnAddPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPaciente.setText("+   Adicionar cliente");
        btnAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPacienteActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAddPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 160, -1));

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 40, 40));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Listagem de clientes");
        pnlPrincipal.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        pnlPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        pnlPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTituloTable.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloTable.setText("Pesquisar cliente:");
        pnlPesquisa.add(lblTituloTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 28));

        txtNomeBusca.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeBusca.setForeground(new java.awt.Color(102, 102, 102));
        txtNomeBusca.setToolTipText("comece a digitar...");
        txtNomeBusca.setBorder(null);
        txtNomeBusca.setNextFocusableComponent(btnNovoLogin);
        txtNomeBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeBuscaMouseClicked(evt);
            }
        });
        txtNomeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeBuscaActionPerformed(evt);
            }
        });
        txtNomeBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeBuscaKeyReleased(evt);
            }
        });
        pnlPesquisa.add(txtNomeBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 260, 28));

        btnPesquisar.setBackground(new java.awt.Color(0, 255, 102));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Buscar");
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 90, 30));

        btnBuscasAvancadas.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscasAvancadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscasAvancadas.setForeground(new java.awt.Color(0, 255, 102));
        btnBuscasAvancadas.setText("| Mais filtros |");
        btnBuscasAvancadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscasAvancadasActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnBuscasAvancadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 120, 30));

        btnMenosFiltro.setBackground(new java.awt.Color(255, 255, 255));
        btnMenosFiltro.setForeground(new java.awt.Color(0, 255, 51));
        btnMenosFiltro.setText("| Menos filtro |");
        btnMenosFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFiltroActionPerformed(evt);
            }
        });
        pnlPesquisa.add(btnMenosFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 120, 30));

        pnlPrincipal.add(pnlPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 640, 50));

        lblMsgErro.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblMsgErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 270, 20));

        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setForeground(new java.awt.Color(102, 102, 102));
        txtData.setToolTipText("informe a data");
        txtData.setBorder(null);
        txtData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDataMouseClicked(evt);
            }
        });
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 120, 30));

        txtBuscaCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscaCpf.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscaCpf.setToolTipText("informe o CPF");
        txtBuscaCpf.setBorder(null);
        txtBuscaCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaCpfMouseClicked(evt);
            }
        });
        txtBuscaCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaCpfKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtBuscaCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 30));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setText("CPF:");
        pnlPrincipal.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 30));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setText("Data:");
        pnlPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 50));

        sprData.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, 10));

        lblOu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOu.setForeground(new java.awt.Color(0, 0, 0));
        lblOu.setText("ou");
        pnlPrincipal.add(lblOu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        sprCpf.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMouseClicked
    }//GEN-LAST:event_tblDadosMouseClicked

    private void btnProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfissionalActionPerformed
        ProfissionalView telaProfissional = new ProfissionalView();
        telaProfissional.setVisible(true);
        this.dispose();
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
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio telaRelatorio = new Relatorio((JFrame) this);
        telaRelatorio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void txtNomeBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeBuscaMouseClicked
        this.txtNomeBusca.setText("");
    }//GEN-LAST:event_txtNomeBuscaMouseClicked

    private void txtNomeBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBuscaKeyReleased
        lblMsgErro.setText("");
    }//GEN-LAST:event_txtNomeBuscaKeyReleased

    private void btnAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPacienteActionPerformed
        PacienteCadastro telaPacienteCadastro = new PacienteCadastro((JFrame) this);
        telaPacienteCadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddPacienteActionPerformed

    private void btnBuscasAvancadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscasAvancadasActionPerformed
        txtData.setVisible(true);
        lblData.setVisible(true);
        sprData.setVisible(true);
        txtBuscaCpf.setVisible(true);
        
        lblOu.setVisible(true);
        
        lblCpf.setVisible(true);
        sprCpf.setVisible(true);
        
        btnMenosFiltro.setVisible(true);
        btnBuscasAvancadas.setVisible(false);
    }//GEN-LAST:event_btnBuscasAvancadasActionPerformed

    private void txtNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeBuscaActionPerformed
    }//GEN-LAST:event_txtNomeBuscaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ClienteController controller = new ClienteController();
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String id = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                
                int comfirme = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este registro?");
                
                if(comfirme == 0) {
                    Cliente c = controller.obterClienteController(Integer.parseInt(id));
                    
                    controller.excluirClienteController(c);
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!", "Exclusão de dados", 0);
                    btnPesquisarActionPerformed(evt);
                    tblDados.clearSelection();
                    
                } else if(comfirme == 1 || comfirme == 2) {
                    tblDados.clearSelection();
                }
            }
        } 
        catch(EntityNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Selecione o registro da tabela corretamente", "ATENÇÃO", 0);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        boolean check;
        ClienteController controller = new ClienteController();
        
        try {
            if(txtBuscaCpf.getText().length() > 0) {
                check = controller.checkCpf(txtBuscaCpf.getText());
                if(check) {
                    List<Cliente> clientes = controller.buscarClienteController(txtNomeBusca.getText(), txtData.getText(), txtBuscaCpf.getText());
                    preenchaTable(clientes);
                } else {
                    lblMsgErro.setText("CPF inválido! Forma correta: 000.000.000-00");
                }
            } else {
                List<Cliente> clientes = controller.buscarClienteController(txtNomeBusca.getText(), txtData.getText(), txtBuscaCpf.getText());
                preenchaTable(clientes);
            }
        } 
        catch(EntityNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Cuidado! Preencha os campos de busca corretamente", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyReleased
        lblMsgErro.setText("");
    }//GEN-LAST:event_txtDataKeyReleased

    private void txtBuscaCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaCpfKeyReleased
        lblMsgErro.setText("");
    }//GEN-LAST:event_txtBuscaCpfKeyReleased

    private void btnMenosFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFiltroActionPerformed
        txtData.setVisible(false);
        txtBuscaCpf.setVisible(false);
        lblData.setVisible(false);
        sprData.setVisible(false);
        
        lblOu.setVisible(false);
        
        lblCpf.setVisible(false);
        sprCpf.setVisible(false);
        
        btnMenosFiltro.setVisible(false);
        btnBuscasAvancadas.setVisible(true);
    }//GEN-LAST:event_btnMenosFiltroActionPerformed

    private void txtDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDataMouseClicked
        txtData.setText("");
    }//GEN-LAST:event_txtDataMouseClicked

    private void txtBuscaCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaCpfMouseClicked
        txtBuscaCpf.setText("");
    }//GEN-LAST:event_txtBuscaCpfMouseClicked

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ClienteController controller = new ClienteController();
        PacienteCadastro paciente = new PacienteCadastro();
        
        try {
            if(tblDados.getSelectedRow() >= 0) {
                String id = (String) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
                Cliente novoCliente = controller.obterClienteController(Integer.parseInt(id));
                paciente.preencheEdicao(novoCliente);
                paciente.setVisible(true);
                this.setVisible(false);
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
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPaciente;
    private javax.swing.JButton btnBuscasAvancadas;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMenosFiltro;
    private javax.swing.JButton btnNovoLogin;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProfissional;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JScrollPane crlTable;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMsgErro;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloTable;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprCpf;
    private javax.swing.JSeparator sprData;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBuscaCpf;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNomeBusca;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Preenche a tabela com todos os dados buscado do Banco de Dados 
     * @param clientes 
     */
    public void preenchaTable(List<Cliente> clientes) {
        String columns[] = {"Registro", "Nome", "Email", "Telefone", "Data de Nascimento", "Gênero"};
        String dados[][] = new String[clientes.size()][columns.length];
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        int i = 0;
        for (Cliente c : clientes) {
            dados[i] = new String[]{
                String.valueOf(c.getIdCliente()),
                c.getNome(),
                c.getEmail(),
                c.getTelefone(),
                c.getDataNascimento().format(formatter),
                c.getGenero()}; 
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(dados, columns);
        tblDados.setModel(tableModel);
    }
    
    /**
     * Inicializa os elementos de busca com visibilidade falsa
     */
    public void initElements() {
        txtData.setVisible(false);
        lblData.setVisible(false);
        sprData.setVisible(false);
        txtBuscaCpf.setVisible(false);
        
        lblOu.setVisible(false);
        
        lblCpf.setVisible(false);
        sprCpf.setVisible(false);
    }
}
