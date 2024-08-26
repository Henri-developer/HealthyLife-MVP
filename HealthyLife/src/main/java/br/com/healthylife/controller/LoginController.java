package br.com.healthylife.controller;

import br.com.healthylife.model.Autenticacao;
import br.com.healthylife.persistence.LoginDAO;

/**
 * Controladora de Login
 * @author Henrique
 */
public class LoginController {
    
    /**
     * Verificando login e senha do usuário
     * @param nome
     * @param senha
     * @return boolean
     */
    public boolean checkLogin(String nome, String senha) {
        LoginDAO loginDAO = new LoginDAO();
        
        Autenticacao autenticacao = loginDAO.autencicar(nome, senha);

        if(autenticacao != null) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Verificação de compos nulos 
     * @param login
     * @param senha
     * @return boolean
     */
    public int checkFields(String login, String senha) {
        int check = 0;
        
        if(login.isEmpty()) {
            check = 1;
        } else if(senha.isEmpty()){
            check = 2;
        }
        return check;
    }
}
