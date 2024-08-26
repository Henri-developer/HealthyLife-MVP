package br.com.healthylife.model;

import br.com.healthylife.persistence.ClienteDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private String genero;
    private String status;

    public Cliente() {
    }

    public Cliente(String nome, String email, String cpf, String telefone, LocalDate dataNascimento, String genero, String status) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.status = status;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**
     * Intermédio para cadastrar Cliente
     * @param cliente 
     */
    public void cadastroClienteModel(Cliente cliente) {
        new ClienteDAO().cadastroPacienteDAO(cliente);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Intermédio para buscar Cliente
     * @param nome
     * @param dataNascimento
     * @param cpf 
     */
    public List<Cliente> buscarClienteModel(String nome, String dataNascimento, String cpf) {
        return new ClienteDAO().buscarCliente(nome, dataNascimento, cpf);
    }
    
    /**
     * Intermédio para obter o Cliente e realizar sua exclusão   
     * @param i
     * @return 
     */
    public Cliente obterClienteModel(int i) {
        return new ClienteDAO().obterCliente(i);
    }
    
    /**
     * Intermédio para excluir Cliente 
     * @param c 
     */
    public void excluirClienteModel(Cliente c) {
        new ClienteDAO().exluirCliente(c);
    }
    
    /**
     * Intermédio para editar o cadastro do Cliente 
     * @param c 
     */
    public void atualizarClienteModel(Cliente c) {
        new ClienteDAO().atualizar(c);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
