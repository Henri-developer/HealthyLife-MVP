package br.com.healthylife.model;

import br.com.healthylife.persistence.ConsultaDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;
    private LocalDate consultaData;
    private String consultaHorario;
    private String consultaTipo;
    private String pacientePrimeiraVez;
    @ManyToOne
    @JoinColumn(name="profissional_id")
    private Profissional profissional;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    private String status;

    public Consulta() {
    }
    
    public Consulta(LocalDate consultaData, String consultaHorario, String consultaTipo, String pacientePrimeiraVez, Profissional profissional, Cliente cliente, String status) {
        this.consultaData = consultaData;
        this.consultaHorario = consultaHorario;
        this.consultaTipo = consultaTipo;
        this.pacientePrimeiraVez = pacientePrimeiraVez;
        this.profissional = profissional;
        this.cliente = cliente;
        this.status = status;
    }
    
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getConsultaData() {
        return consultaData;
    }

    public void setConsultaData(LocalDate consultaData) {
        this.consultaData = consultaData;
    }

    public String getConsultaHorario() {
        return consultaHorario;
    }

    public void setConsultaHorario(String consultaHorario) {
        this.consultaHorario = consultaHorario;
    }

    public String getConsultaTipo() {
        return consultaTipo;
    }

    public void setConsultaTipo(String consultaTipo) {
        this.consultaTipo = consultaTipo;
    }

    public String getPacientePrimeiraVez() {
        return pacientePrimeiraVez;
    }

    public void setPacientePrimeiraVez(String pacientePrimeiraVez) {
        this.pacientePrimeiraVez = pacientePrimeiraVez;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Intermédio para cadastrar Consulta
     * @param consulta 
     */
    public void cadastroConsultaModel(Consulta consulta) {
        new ConsultaDAO().cadastrarConsulta(consulta);
    }
    
    /**
     * Intermédio para buscar Consulta
     * @param data
     * @param horario
     * @param paciente
     * @param profissional
     * @return Consulta
     */
    public List<Consulta> buscarConsultaModel(String data, String horario, String paciente, String profissional) {
        return new ConsultaDAO().buscarConsultas(data, horario, paciente, profissional);
    }
    
    /**
     * Intermédio para obter o Consulta e realizar sua exclusão   
     * @param i
     * @return Consulta
     */
    public Consulta obterConsultaModel(int i) {
        return new ConsultaDAO().obterConsulta(i);
    }
    
    /**
     * Intermédio para excluir Consulta 
     * @param c 
     */
    public void excluirConsultaModel(Consulta c) {
        new ConsultaDAO().excluirConsulta(c);
    }
    
    /**
     * Intermédio para editar o cadastro de Consulta   
     * @param c 
     */
    public void atualizarConsultaModel(Consulta c) {
        new ConsultaDAO().atualizar(c);
    }
}
