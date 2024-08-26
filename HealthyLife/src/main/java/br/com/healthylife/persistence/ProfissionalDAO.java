package br.com.healthylife.persistence;

import br.com.healthylife.model.Profissional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class ProfissionalDAO {
    
    EntityManager manager = JPAUtil.getEntityManager();
    
    /**
     * Cadastrando Profissional ao Banco de Dados
     * @param profissional 
     */
    public void cadastroProfissionalDAO(Profissional profissional) {
        try {
            manager.getTransaction().begin();
            manager.persist(profissional);
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
    
    /**
     *  Retornando uma lista completa de todos os Profissionais 
     * @return Profissional
     */
     public List<Profissional> listarProfissional() {
        List<Profissional> profissionais = new ArrayList<Profissional>();
        try {
            Query consulta = manager.createQuery("SELECT p FROM Profissional p");
            profissionais = consulta.getResultList(); 
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
        return profissionais;
    }
     
     /**
     *  Retornando uma lista completa de todos os Profissionais a busca 
     * @return Profissional
     */
     public List<Profissional> listarProfissionalBusca(String nome) {
        List<Profissional> profissionais = new ArrayList<Profissional>();
        try {
            Query consulta = manager.createQuery("SELECT p FROM Profissional p WHERE p.nome LIKE :nome");
            consulta.setParameter("nome", "%" + nome + "%");
            profissionais = consulta.getResultList(); 
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
        return profissionais;
    }
     
     /**
      * Retornando busca conforme nome ou especialidade 
      * @param nome
      * @param especialidade
      * @return Profissional
      */
     public List<Profissional> buscarProfissional(String nome, String especialidade) {
         List<Profissional> profissionais = new ArrayList<Profissional>();
         
         try {
             Query consulta = manager.createQuery("SELECT p FROM Profissional p "
                     + "WHERE (:nome is null OR p.nome LIKE :nome)"
                     + "AND (:especialidade is null OR p.especialidade LIKE :especialidade) "
                     + "AND p.status = 'A'");
             
             consulta.setParameter("nome", nome.isEmpty() ? null : "%" + nome + "%");
             consulta.setParameter("especialidade", especialidade.isEmpty() ? null : "%" + especialidade + "%");
             
             profissionais = consulta.getResultList();
         } 
         catch(Exception e) {
             manager.getTransaction().rollback();
             throw e;
         } 
         finally {
             JPAUtil.closeEtityManager();
         }
         return profissionais;
     }
     
     /**
      * Obtem o Profissional escolhido na tabela 
      * @param id
      * @return Profissional
      */
     public Profissional obterProfissional(int id) {
         try {
             return manager.find(Profissional.class, id);
         } 
         finally {
             JPAUtil.closeEtityManager();
         }
     }
     
     /**
      * Exclusão de Profissional
      * @param p 
      */
     public void exluirProfissional(Profissional p) {
        try {
            manager.getTransaction().begin();
            p.setStatus("I");
            manager.merge(p);
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
     
     /**
      * Retorna a quantidade de profissionais cadastrados 
      * @return long
      */
     public long profissionaisTotais() {
         String consulta = "SELECT COUNT(p) FROM Profissional p WHERE p.status = 'A'";
         
         TypedQuery<Long> query = manager.createQuery(consulta, Long.class);
         
         return query.getSingleResult();
     }
     
     /**
      * Atualização do Profissional
      * @param p 
      */
     public void atualizar(Profissional p) {
         try {
             manager.getTransaction().begin();
             manager.merge(p);
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
