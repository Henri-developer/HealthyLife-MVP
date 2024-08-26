package br.com.healthylife.controller;

import br.com.healthylife.model.Profissional;
import java.util.List;

public class ProfissionalController {
    
    /**
     * Verificando se não existe campos nulos antes do cadastro de Profissional
     * @param nome
     * @param especialidade
     * @return int
     */
    public int resultProfissional(String nome, String especialidade) {
        int check = 0;
        
        if(nome.isEmpty()) {
            check = 1;
        } else if(especialidade.isEmpty()) {
            check = 2;
        } 
        return check;
    }
    
    /**
     * Cadastrando Profissional
     * @param nome
     * @param especialidade 
     */
    public void cadastrarProfissional(String nome, String especialidade) {
        Profissional profissional = new Profissional(nome, especialidade, "A");
        profissional.cadastrarProfissionalModel(profissional);
    }
    
    /**
     * Intermédio para buscar Profissional
     * @param nome
     * @param especialidade
     * @return Profissional
     */
    public List<Profissional> buscarProfissionalController(String nome, String especialidade) {
        return new Profissional().buscarProfissionalModel(nome, especialidade);
    }
    
    /**
     * Intermédio para excluir Profissional 
     * @param i
     * @return boolean
     */
    public void excluirProfissionalController(Profissional p) {
        new Profissional().excluirProfissionalModel(p);
    }
    
    /**
     * Intermédio para obter o Profissional e realizar sua exclusão   
     * @param i 
     */
    public Profissional obterProfissionalController(int i) {
        return new Profissional().obterProfissionalModel(i);
    }
    
    /**
     * Intermédio para editar o cadastro do Profissional 
     * @param p 
     */
    public void atualizarProfissionalController(Profissional p) {
        new Profissional().atualizarProfissionalModel(p);
    }
}
