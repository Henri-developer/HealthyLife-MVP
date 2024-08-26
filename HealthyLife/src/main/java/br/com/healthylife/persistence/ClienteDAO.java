package br.com.healthylife.persistence;

import br.com.healthylife.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    EntityManager manager = JPAUtil.getEntityManager();
    
    /**
     * Cadastrando Cliente ao Banco de Dados
     * @param cliente 
     */
    public void cadastroPacienteDAO(Cliente cliente) {
        try {
            manager.getTransaction().begin();
            manager.persist(cliente);
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
     * Retornando uma lista completa de todos os Clientes 
     * @return Cliente
     */
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            Query consulta = manager.createQuery("SELECT c FROM Cliente c");
            clientes = consulta.getResultList();
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
        return clientes;
    }
    
    /**
     * Retornando uma lista completa de todos os Clientes conforme a busca
     * @param nome
     * @return Cliente
     */
    public List<Cliente> listarClienteBusca(String nome) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            Query consulta = manager.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :nome");
            consulta.setParameter("nome", "%" + nome + "%");
            clientes = consulta.getResultList();
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
        return clientes;
    }
    
    /**
     * Retornando busca conforme nome, data de nascimento e(ou) cpf
     * @param nome
     * @param dataNascimento
     * @param cpf
     * @return Cliente
     */
    public List<Cliente> buscarCliente(String nome, String dataNascimento, String cpf) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            Query consulta = manager.createQuery("SELECT c FROM Cliente c "
                    + "WHERE (:nome is null OR c.nome LIKE :nome)"
                    + "AND (:dataNascimento is null OR c.dataNascimento >= :dataNascimento)"
                    + "AND (:cpf is null OR c.cpf LIKE :cpf) "
                    + "AND c.status = 'A'");
            
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            consulta.setParameter("nome", nome.isEmpty() ? null : "%" + nome + "%");
            consulta.setParameter("dataNascimento", dataNascimento.isEmpty() ? null : 
                    LocalDate.parse(dataNascimento, format));
            consulta.setParameter("cpf", cpf.isEmpty() ? null : "%" + cpf + "%");
            
            clientes = consulta.getResultList();
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
        return clientes;
    }
    
    /**
     * Obtem o Cliente escolhido na tabela 
     * @param i
     * @return Cliente
     */
    public Cliente obterCliente(int i) {
        try {
            return manager.find(Cliente.class, i);
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
    
    /**
     * Exclusão de Cliente
     * @param c 
     */
    public void exluirCliente(Cliente c) {
        try {
            manager.getTransaction().begin();
            c.setStatus("I");
            manager.merge(c);
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
     * Retorna a quantidade de pacientes cadastrados  
     * @return long
     */
    public long pacientesTotais() {
        String consulta = "SELECT COUNT(c) FROM Cliente c WHERE c.status = 'A'";
        
        TypedQuery<Long> query = manager.createQuery(consulta, Long.class);
        
        return query.getSingleResult();
    }
    
    /**
     * Atualização do Cliente
     * @param c 
     */
    public void atualizar(Cliente c) {
        try {
            manager.getTransaction().begin();
            manager.merge(c);
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
