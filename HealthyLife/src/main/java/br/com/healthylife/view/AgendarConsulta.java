package br.com.healthylife.view;

import br.com.healthylife.controller.ConsultaController;
import br.com.healthylife.model.Cliente;
import br.com.healthylife.model.Consulta;
import br.com.healthylife.model.Profissional;
import br.com.healthylife.persistence.ClienteDAO;
import br.com.healthylife.persistence.ProfissionalDAO;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AgendarConsulta extends javax.swing.JFrame {
    
    private Consulta consultaEdicao = null;
    private static final boolean PESQUISA_DADOS = true;
    
    public AgendarConsulta() {
        initComponents();
        preecherComboClinte();
        preencherComboProfissional();
        /**
         * Botão será habilitado apenas se for um edição, no entanto ele será falso 
         */
        btnCancelaEdicao.setVisible(false);
    }
    
    public AgendarConsulta(boolean cancelaEdicao) {
        initComponents();
        preecherComboClinte();
        preencherComboProfissional();
        if(cancelaEdicao) {
            btnCancelaEdicao.setVisible(true);
        }
    }
    
    /**
     * Preenche os campos com a Consulta selecionada da tabela 
     * @param c 
     */
    public void preencheEdicao(Consulta c) {
        txtNomeCliente.setText(c.getCliente().getNome());
        DefaultComboBoxModel<Cliente> clienteModel = new DefaultComboBoxModel<>();
        clienteModel.addElement(c.getCliente());
        cbbCliente.setModel(clienteModel);
        
        txtHorario.setText(c.getConsultaHorario());
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtData.setText(c.getConsultaData().format(formatter));
        
        txtNomeProfissional.setText(c.getProfissional().getNome());
        DefaultComboBoxModel<Profissional> profissionalModel = new DefaultComboBoxModel<>();
        profissionalModel.addElement(c.getProfissional());
        cbbProfissional.setModel(profissionalModel);
        
        if(c.getPacientePrimeiraVez().equals("Sim")) {
            ckbSim.setSelected(true);
            ckbNao.setSelected(false);
        } else {
            ckbNao.setSelected(true);
        }
        consultaEdicao = c;
    }
    
    /**
     * Verifica se já era um paciente ou não 
     * @return String
     */
    public String eraPaciente() {
        String result = null;
        if(ckbSim.isSelected()) {
            result = "Sim";
        } else if(ckbNao.isSelected()) {
            result = "Não";
        }
        return result;
    }
    
    /**
     * Adicioanando o nome do Profissional ao ComboBox conforme a busca do usuário
     */
    public void pesquisaNomeProfissional() {
        ProfissionalDAO profissionalDAO = new ProfissionalDAO();
        
        for (Profissional profissional : profissionalDAO.listarProfissionalBusca(txtNomeProfissional.getText())) {
            cbbProfissional.addItem(profissional);
        }
    }
    
    /**
     * Adicioanando o nome do Cliente ao ComboBox conforme a busca do usuário
     */
    public void pesquisaNomeCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        for (Cliente nomeCliente : clienteDAO.listarClienteBusca(txtNomeCliente.getText())) {
            cbbCliente.addItem(nomeCliente);
        }
    }
    
    /**
     * Obtendo o nome clinte escolhido pelo usuário e adicionando ao campo de texto 
     */
    public void getNomeCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> listCliente = clienteDAO.listarCliente();
        
        int linhaSelecionada = cbbCliente.getSelectedIndex();
        
        for (int i = 0; i < listCliente.size(); i++) {
            String nome = listCliente.get(linhaSelecionada).getNome();
            
            txtNomeCliente.setText(nome);
        }
    }
    
    /**
     * Obtendo o nome do profissional escolhido pelo usuário e adicionando ao campo de texto 
     */
    public void getNomeProfissional() {
        ProfissionalDAO profissionalDAO = new ProfissionalDAO();
        int linhaSelecionada = cbbProfissional.getSelectedIndex();
       
        List<Profissional> listProfissional = profissionalDAO.listarProfissional();
       
        for (int i = 0; i < listProfissional.size(); i++) {
            String nome = listProfissional.get(linhaSelecionada).getNome();
            
            txtNomeProfissional.setText(nome);
        }
    }
    
    /**
     * Preenchendo combo com todos Profissionais cadastrados 
     */
    public void preencherComboProfissional() {
        ProfissionalDAO profissionalDAO = new ProfissionalDAO();
        for (Profissional p : profissionalDAO.listarProfissional()) {
            cbbProfissional.addItem(p);
        }
    }
    
    /**
     * Preenchendo combo com todos Clientes cadastrados 
     */
    public void preecherComboClinte() {
        ClienteDAO clienteDAO = new ClienteDAO();
        for (Cliente c : clienteDAO.listarCliente()) {
            cbbCliente.addItem(c);
        }
    }
    
    /**
     * Limpar dados dos compos de texto
     */
    public void limparDados() {
        this.txtNomeCliente.setText("");
        this.txtNomeProfissional.setText("");
        this.txtData.setText("");
        this.txtHorario.setText("");
        this.ckbSim.setSelected(false);
        this.ckbNao.setSelected(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblMsgConsulta = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        sprPaciente = new javax.swing.JSeparator();
        lblProfissional = new javax.swing.JLabel();
        txtNomeProfissional = new javax.swing.JTextField();
        sprProfissional = new javax.swing.JSeparator();
        sprHorario = new javax.swing.JSeparator();
        lblData = new javax.swing.JLabel();
        btnSalvarCosulta = new javax.swing.JButton();
        sprData = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        txtHorario = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        lblTraco = new javax.swing.JLabel();
        lblEventoAcontecera = new javax.swing.JLabel();
        cbbTipoEvento = new javax.swing.JComboBox<>();
        lblJaEraPaciente = new javax.swing.JLabel();
        ckbSim = new javax.swing.JCheckBox();
        ckbNao = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnNovoProfissional = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        cbbCliente = new javax.swing.JComboBox<>();
        cbbProfissional = new javax.swing.JComboBox<>();
        btnCancelaEdicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(839, 560));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMsgConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMsgConsulta.setForeground(new java.awt.Color(255, 0, 0));
        pnlPrincipal.add(lblMsgConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 320, 21));

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(0, 0, 0));
        lblPaciente.setLabelFor(txtNomeCliente);
        lblPaciente.setText("Paciente:");
        pnlPrincipal.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setToolTipText("Nome paciente");
        txtNomeCliente.setBorder(null);
        txtNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeClienteMousePressed(evt);
            }
        });
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 320, -1));

        sprPaciente.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 10));

        lblProfissional.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProfissional.setForeground(new java.awt.Color(0, 0, 0));
        lblProfissional.setLabelFor(txtNomeProfissional);
        lblProfissional.setText("Profissional:");
        pnlPrincipal.add(lblProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        txtNomeProfissional.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeProfissional.setToolTipText("Nome profissional");
        txtNomeProfissional.setBorder(null);
        txtNomeProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeProfissionalMousePressed(evt);
            }
        });
        txtNomeProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProfissionalActionPerformed(evt);
            }
        });
        txtNomeProfissional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProfissionalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProfissionalKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtNomeProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 320, 20));

        sprProfissional.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 290, 320, 10));

        sprHorario.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 10));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 0));
        lblData.setLabelFor(txtData);
        lblData.setText("Quando acontece o evento?:");
        pnlPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 170, -1));

        btnSalvarCosulta.setBackground(new java.awt.Color(0, 0, 255));
        btnSalvarCosulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarCosulta.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCosulta.setText("Salvar");
        btnSalvarCosulta.setToolTipText("Salvar Alt+S");
        btnSalvarCosulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCosultaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnSalvarCosulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 90, -1));

        sprData.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sprData, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 230, 120, 10));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastrar evento");
        pnlPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.setBorder(null);
        txtHorario.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHorarioKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, 30));

        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setBorder(null);
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataKeyReleased(evt);
            }
        });
        pnlPrincipal.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 120, 30));

        lblTraco.setForeground(new java.awt.Color(0, 0, 0));
        lblTraco.setText("-");
        pnlPrincipal.add(lblTraco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 10, -1));

        lblEventoAcontecera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEventoAcontecera.setForeground(new java.awt.Color(0, 0, 0));
        lblEventoAcontecera.setText("Como o evento acontecerão?:");
        pnlPrincipal.add(lblEventoAcontecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        cbbTipoEvento.setBackground(new java.awt.Color(255, 255, 255));
        cbbTipoEvento.setForeground(new java.awt.Color(0, 0, 0));
        cbbTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presencial", "Oline" }));
        cbbTipoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbTipoEventoMouseClicked(evt);
            }
        });
        pnlPrincipal.add(cbbTipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 170, -1));

        lblJaEraPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJaEraPaciente.setForeground(new java.awt.Color(0, 0, 0));
        lblJaEraPaciente.setText("Primeira vez:");
        pnlPrincipal.add(lblJaEraPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, 20));

        ckbSim.setBackground(new java.awt.Color(255, 255, 255));
        ckbSim.setForeground(new java.awt.Color(0, 0, 0));
        ckbSim.setText("Sim");
        ckbSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbSimMouseClicked(evt);
            }
        });
        ckbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSimActionPerformed(evt);
            }
        });
        pnlPrincipal.add(ckbSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        ckbNao.setBackground(new java.awt.Color(255, 255, 255));
        ckbNao.setForeground(new java.awt.Color(0, 0, 0));
        ckbNao.setSelected(true);
        ckbNao.setText("Não");
        ckbNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbNaoMouseClicked(evt);
            }
        });
        ckbNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbNaoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(ckbNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Limpar campo");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        btnNovoProfissional.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoProfissional.setToolTipText("Novo profissional");
        btnNovoProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProfissionalActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnNovoProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 40, 30));

        btnNovoCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setToolTipText("Novo cliente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnNovoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 40, 30));

        cbbCliente.setBackground(new java.awt.Color(255, 255, 255));
        cbbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbClienteMouseClicked(evt);
            }
        });
        cbbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbClienteActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cbbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, -1));

        cbbProfissional.setBackground(new java.awt.Color(255, 255, 255));
        cbbProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbProfissionalMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbbProfissionalMouseReleased(evt);
            }
        });
        cbbProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbProfissionalActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cbbProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 170, -1));

        btnCancelaEdicao.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelaEdicao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelaEdicao.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelaEdicao.setText("Cancelar edição");
        btnCancelaEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaEdicaoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancelaEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCosultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCosultaActionPerformed
        ConsultaController controller = new ConsultaController();
        
        Consulta novaConsulta = new Consulta();
        if(consultaEdicao != null) {
            novaConsulta = consultaEdicao;
        }
       
        Cliente cliente = (Cliente) cbbCliente.getSelectedItem();
        Profissional profissional = (Profissional) cbbProfissional.getSelectedItem();
        
        String nomeCliente = txtNomeCliente.getText();
        String nomeProfissional = txtNomeProfissional.getText();
        String horarioConsulta = txtHorario.getText();
        String dataConsulta = txtData.getText();
        String tipoEvento = (String) cbbTipoEvento.getSelectedItem();
        String primeiraVez = eraPaciente();
        
        boolean check = controller.checkFields(nomeCliente, nomeProfissional, horarioConsulta, dataConsulta);
        
        try {
            if(check == false){
                JOptionPane.showMessageDialog(null, "Cuidado! Existe campos não preenchidos corretamente", "ATENÇÃO", HEIGHT);
            } else {
                if(consultaEdicao == null) {
                    controller.cadastrarConsulta(cliente, profissional, horarioConsulta, LocalDate.parse(txtData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), tipoEvento, primeiraVez);
                    JOptionPane.showMessageDialog(null, "Sucesso! Consulta agendada.");
                } else {
                    novaConsulta.setCliente(cliente);
                    novaConsulta.setProfissional(profissional);
                    novaConsulta.setConsultaData(LocalDate.parse(txtData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    novaConsulta.setConsultaHorario(horarioConsulta);
                    novaConsulta.setConsultaTipo(tipoEvento);
                    novaConsulta.setPacientePrimeiraVez(primeiraVez);
                    
                    controller.atualizarConsultaController(novaConsulta);
                    ConsultaView consultaView = new ConsultaView(PESQUISA_DADOS);
                    consultaView.setVisible(true);
                    this.dispose();
                }
                /**
                 * consultaEdicao volta a ser nulo 
                 */
                consultaEdicao = null;
                limparDados();
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //JOptionPane.showMessageDialog(null, "Erro ao agendar consulta! Verifique os campos", "ATENÇÃO", HEIGHT);
        }
    }//GEN-LAST:event_btnSalvarCosultaActionPerformed

    private void txtNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyReleased
        lblMsgConsulta.setText("");
        cbbCliente.removeAllItems();
        pesquisaNomeCliente();
    }//GEN-LAST:event_txtNomeClienteKeyReleased

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtNomeProfissionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProfissionalKeyReleased
        lblMsgConsulta.setText("");
        cbbProfissional.removeAllItems();
        pesquisaNomeProfissional();
    }//GEN-LAST:event_txtNomeProfissionalKeyReleased

    private void txtNomeClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeClienteMousePressed
    }//GEN-LAST:event_txtNomeClienteMousePressed

    private void txtNomeProfissionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeProfissionalMousePressed
    }//GEN-LAST:event_txtNomeProfissionalMousePressed

    private void ckbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSimActionPerformed
        if(this.ckbSim.isSelected()) {
            this.ckbNao.setSelected(false);
        }
    }//GEN-LAST:event_ckbSimActionPerformed

    private void ckbNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbNaoActionPerformed
        if(this.ckbNao.isSelected()) {
            this.ckbSim.setSelected(false);
        }
    }//GEN-LAST:event_ckbNaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparDados();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProfissionalActionPerformed
        ProfissionalView telaProfissional = new ProfissionalView((JFrame) this);
        telaProfissional.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNovoProfissionalActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        PacienteCadastro telaPacienteCadastro = new PacienteCadastro((JFrame) this);
        telaPacienteCadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void txtNomeProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProfissionalActionPerformed
    }//GEN-LAST:event_txtNomeProfissionalActionPerformed

    private void txtNomeProfissionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProfissionalKeyTyped
    }//GEN-LAST:event_txtNomeProfissionalKeyTyped

    private void cbbTipoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbTipoEventoMouseClicked
        lblMsgConsulta.setText("");
    }//GEN-LAST:event_cbbTipoEventoMouseClicked

    private void cbbProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbProfissionalActionPerformed
    }//GEN-LAST:event_cbbProfissionalActionPerformed

    private void cbbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbClienteActionPerformed
    }//GEN-LAST:event_cbbClienteActionPerformed

    private void txtHorarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorarioKeyReleased
        lblMsgConsulta.setText("");
        
        boolean check;
        ConsultaController controller = new ConsultaController();
        
        check = controller.validHorario(txtHorario.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtHorario.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtHorario.setBorder(border);
        }
    }//GEN-LAST:event_txtHorarioKeyReleased

    private void txtDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyReleased
        lblMsgConsulta.setText("");
        
        boolean check;
        ConsultaController controller = new ConsultaController();
        
        check = controller.validData(txtData.getText());
        
        if(check == false) {
            Border border = BorderFactory.createLineBorder(Color.RED);
            txtData.setBorder(border);
        } else {
            Border border = BorderFactory.createLineBorder(Color.WHITE);
            txtData.setBorder(border);
        }
    }//GEN-LAST:event_txtDataKeyReleased

    private void cbbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbClienteMouseClicked
        getNomeCliente();
    }//GEN-LAST:event_cbbClienteMouseClicked

    private void ckbSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbSimMouseClicked
    }//GEN-LAST:event_ckbSimMouseClicked

    private void ckbNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbNaoMouseClicked
        lblMsgConsulta.setText("");
    }//GEN-LAST:event_ckbNaoMouseClicked

    private void cbbProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbProfissionalMouseClicked
        getNomeProfissional();
    }//GEN-LAST:event_cbbProfissionalMouseClicked

    private void cbbProfissionalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbProfissionalMouseReleased
    }//GEN-LAST:event_cbbProfissionalMouseReleased

    private void btnCancelaEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaEdicaoActionPerformed
        new ConsultaView().setVisible(true);
        btnCancelaEdicao.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelaEdicaoActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelaEdicao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoProfissional;
    public static javax.swing.JButton btnSalvarCosulta;
    private javax.swing.JComboBox<Cliente> cbbCliente;
    private javax.swing.JComboBox<Profissional> cbbProfissional;
    private javax.swing.JComboBox<String> cbbTipoEvento;
    private javax.swing.JCheckBox ckbNao;
    private javax.swing.JCheckBox ckbSim;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEventoAcontecera;
    private javax.swing.JLabel lblJaEraPaciente;
    public static javax.swing.JLabel lblMsgConsulta;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblProfissional;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTraco;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sprData;
    private javax.swing.JSeparator sprHorario;
    private javax.swing.JSeparator sprPaciente;
    private javax.swing.JSeparator sprProfissional;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHorario;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProfissional;
    // End of variables declaration//GEN-END:variables
}
