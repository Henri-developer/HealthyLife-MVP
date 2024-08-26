package br.com.healthylife.model;

import br.com.healthylife.persistence.ProfissionalDAO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Profissional {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfissional;
    private String nome;
    private String especialidade;
    private String status;

    public Profissional() {
    }

    public Profissional(String nome, String especialidade, String status) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.status = status;
    }
    
    public int getId() {
        return idProfissional;
    }

    public void setId(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Intermédio para cadastrar Profissional
     * @param profissional 
     */
    public void cadastrarProfissionalModel(Profissional profissional) {
        new ProfissionalDAO().cadastroProfissionalDAO(profissional);
    }
    
    /**
     * Intermédio para buscar Profissional
     * @param nome
     * @param especialidade
     * @return Profissional
     */
    public List<Profissional> buscarProfissionalModel(String nome, String especialidade) {
        return new ProfissionalDAO().buscarProfissional(nome, especialidade);
    }
    
    /**
     * Intermédio para excluir Profissional 
     * @param i
     * @return boolean
     */
    public void excluirProfissionalModel(Profissional p) {
        new ProfissionalDAO().exluirProfissional(p);
    }
    
    /**
     * Intermédio para obter o Profissional e realizar sua exclusão   
     * @param i 
     */
    public Profissional obterProfissionalModel(int i) {
        return new ProfissionalDAO().obterProfissional(i);
    }
    
    /**
     *Intermédio para editar o cadastro do Profissional    
     * @param p 
     */
    public void atualizarProfissionalModel(Profissional p) {
         new ProfissionalDAO().atualizar(p);
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}
