package br.com.healthylife.persistence;

import br.com.healthylife.model.Autenticacao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class LoginDAO {
    
    public Autenticacao autencicar(String login, String senha) {
        EntityManager manager = JPAUtil.getEntityManager();
        
        try {
            TypedQuery<Autenticacao> query = manager.createQuery("SELECT a FROM Autenticacao a "
                    + "WHERE a.loginUsuario = :login AND a.senhaUsuario = :senha", Autenticacao.class);
            
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            return query.getSingleResult();
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
