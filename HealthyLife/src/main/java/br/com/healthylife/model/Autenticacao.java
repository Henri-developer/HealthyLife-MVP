package br.com.healthylife.model;

import br.com.healthylife.persistence.CadastroDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autenticacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String nomeUsuario;
    private String senhaUsuario;
    private String loginUsuario;
    private String email;
    private String telefone;

    public Autenticacao() {
    }

    public Autenticacao(String nomeUsuario, String senhaUsuario, String loginUsuario, String email, String telefone) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.loginUsuario = loginUsuario;
        this.email = email;
        this.telefone = telefone;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /**
     * Intermédio para cadastro de Usuário 
     * @param autenticacao 
     */
    public void cadastroUsuarioModel(Autenticacao autenticacao) {
        new CadastroDAO().cadastroUsuario(autenticacao);
    }
}
