package br.com.healthylife.controller;

import br.com.healthylife.model.Cliente;
import static br.com.healthylife.view.PacienteCadastro.lblMsgPaciente;
import java.time.LocalDate;
import java.util.List;

public class ClienteController {
    
    /**
     * Cadastrando Cliente 
     * @param nome
     * @param email
     * @param cpf
     * @param telefone
     * @param dataNascimento
     * @param genero 
     */
    public void cadastrarCliente(String nome, String email, String cpf, String telefone, LocalDate dataNascimento, 
            String genero) {
        Cliente cliente = new Cliente(nome, email, cpf, telefone, dataNascimento, genero, "A");
        cliente.cadastroClienteModel(cliente);
    }
    
    /**
     * Verifica campos nulos ou formato inválidos 
     * @param email
     * @param cpf
     * @param telefone
     * @param dataNascimento
     * @return boolean
     */
    public boolean checkFields(String nome, String email, String cpf, String telefone, String dataNascimento) {
        if(!validField(nome, "^[a-zA-ZÀ-ÿ\\s]+$", "Nome invávilo")) {
            return false;
        }
        if(!validField(email, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "Email inválido")) {
            return false;
        }
        if(!validField(cpf, "[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}", "CPF inválido")) {
            return false;
        }
        if(!validField(telefone, "[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}", "Telefone inválido")) {
            return false;
        }
        if(!validField(dataNascimento, "[0-9]{2}[/][0-9]{2}[/][0-9]{4}", "Data de Nascimento inválida")) {
            return false;
        }
        return true;
    }
    
    /**
     * Verifica se possui campos nulos ou inválidos
     * @param field
     * @param format
     * @param erroMessage
     * @return boolean
     */
    private boolean validField(String field, String format, String erroMessage) {
        if(field == null || !field.matches(format)) {
            lblMsgPaciente.setText(erroMessage);
            return false;
        }
        return true;
    }
    
    /**
     * Validando formato de Email
     * @param email
     * @return boolean
     */
    public boolean checkEmail(String email) {
        boolean checkEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        
        if(checkEmail == false) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Valida o formato do CPF 
     * @param cpf
     * @return boolean
     */
    public boolean checkCpf(String cpf) {
        boolean check = false;
        check = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        
        if(check) {
            check = true;
        }
        return check;
    }
    
    /**
     * Valida o formato do Telefone 
     * @param cpf
     * @return boolean
     */
    public boolean checkTelefone(String telefone) {
        boolean check = false;
        check = telefone.matches("[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}");
        
        if(check) {
            check = true;
        }
        return check;
    }
    
    /**
     * Valida o formato da Data de Nascimento  
     * @param cpf
     * @return boolean
     */
    public boolean checkDataNascimento(String dataNascimento) {
        boolean check = false;
        check = dataNascimento.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        
        if(check) {
            check = true;
        }
        return check;
    }
    
    /**
     * Intermédio para buscar Cliente
     * @param nome
     * @param dataNascimento
     * @param cpf
     * @return Cliente
     */
    public List<Cliente> buscarClienteController(String nome, String dataNascimento, String cpf) {
        return new Cliente().buscarClienteModel(nome, dataNascimento, cpf);
    }
    
    /**
     * Intermédio para obter o Cliente e realizar sua exclusão   
     * @param i
     * @return 
     */
    public Cliente obterClienteController(int i) {
        return new Cliente().obterClienteModel(i);
    }
    
    /**
     * Intermédio para excluir Cliente 
     * @param c 
     */
    public void excluirClienteController(Cliente c) {
        new Cliente().excluirClienteModel(c);
    }
    
    /**
     * Intermédio para editar o cadastro do Cliente 
     * @param c 
     */
    public void atualizarClienteController(Cliente c) {
        new Cliente().atualizarClienteModel(c);
    }
}
