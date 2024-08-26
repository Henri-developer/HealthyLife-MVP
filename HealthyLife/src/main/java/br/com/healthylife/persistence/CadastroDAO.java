package br.com.healthylife.persistence;

import br.com.healthylife.model.Autenticacao;
import jakarta.persistence.EntityManager;

public class CadastroDAO {
    
    EntityManager manager = JPAUtil.getEntityManager();
    
    /**
     * Cadastro de usuários 
     * @param autenticacao 
     */
    public void cadastroUsuario(Autenticacao autenticacao) {
        try {
            manager.getTransaction().begin();
            manager.persist(autenticacao);
            manager.getTransaction().commit();
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
    }
}
