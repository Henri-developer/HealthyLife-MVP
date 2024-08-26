package br.com.healthylife.controller;

import br.com.healthylife.model.Autenticacao;
import static br.com.healthylife.view.Cadastro.lblMsgCadastro;

public class CadastroController {
    
    /**
     * Validando formato do email 
     * @param email
     * @return boolean
     */
    /*public boolean emailFormat(String email) {
        boolean checkEmail;
        
        checkEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        
        if(email != null && checkEmail) {
            return true;
        } else {
            return false;
        }
    }*/
    
    /**
     * Validando formato do telefone
     * @param telefone
     * @return boolean
     */
    /*public boolean telefoneFormat(String telefone) {
        boolean checkTelefone;
        
        checkTelefone = telefone.matches("[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}");
        
        if(telefone != null && checkTelefone) {
            return true;
        } else {
            return false;
        }
    }*/
    
    /**
     * Cadastrando um novo Usuário 
     * @param nome
     * @param senha
     * @param login
     * @param email
     * @param telefone 
     */
    public void cadastro(String nome, String senha, String login, String email, String telefone) {
        Autenticacao autenticacao = new Autenticacao(nome, senha, login, email, telefone);
        autenticacao.cadastroUsuarioModel(autenticacao);
    }
    
    /**
     * Verificação de compos nulos e cadastro de Usuário
     * @param nome
     * @param senha
     * @param login
     * @param email
     * @param telefone
     * @return boolean
     */
    /*public boolean cadastroUsuarioController(String nome, String senha, String login, String email, String telefone) {
        if(!nome.isEmpty() && !senha.isEmpty() && !login.isEmpty() && emailFormat(email) && telefoneFormat(telefone)) {
            cadastro(nome, senha, login, email, telefone);
            return true;
        } else {
            return false;
        }
    }*/
    
    /**
     * Verifica campos nulos ou formato inválidos 
     * @param nome
     * @param senha
     * @param login
     * @param email
     * @param telefone
     * @return boolean
     */
    public boolean checkFields(String nome, String senha, String login, String email, String telefone) {
        if(!validField(nome, "^[a-zA-ZÀ-ÿ\\s]+$", "Nome inválido")) {
            return false;
        }
        if(!validField(senha, "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$", "Senha inválida")) {
            return false;
        }
        if(!validField(login, "^[a-zA-ZÀ-ÿ\\s]+$", "Nome de login inválido")) {
            return false;
        }
        if(!validField(email, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "Email inválido")) {
            return false;
        }
        if(!validField(telefone, "[(][0-9]{2}[)][ ][0-9]{4}[-][0-9]{4}", "Telefone inválido")) {
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
    public boolean validField(String field, String format, String erroMessage) {
        if(field == null || !field.matches(format)) {
            lblMsgCadastro.setText(erroMessage);
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
}
