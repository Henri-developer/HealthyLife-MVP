package br.com.healthylife.persistence;

import br.com.healthylife.model.Consulta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {
    
    EntityManager manager = JPAUtil.getEntityManager();
    
    /**
     * Cadastrando Consulta ao Banco de Dados
     * @param consulta 
     */
    public void cadastrarConsulta(Consulta consulta) {
        try {
            manager.getTransaction().begin();
            manager.persist(consulta);
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
     * Retornando busca conforme nome ou especialidade 
     * @param data
     * @param horario
     * @param paciente
     * @param profissional
     * @return Consulta
     */
    public List<Consulta> buscarConsultas(String data, String horario, String nomePaciente, String nomeProfissional) {
        List<Consulta> consultas = new ArrayList<Consulta>();
        
        try {
            Query consulta = manager.createQuery("SELECT c FROM Consulta c "
                    + "WHERE (:data is null OR c.consultaData >= :data)"
                    + "AND (:horario is null OR c.consultaHorario LIKE :horario) "
                    + "AND (:paciente is null OR c.cliente.nome LIKE :paciente) "
                    + "AND (:profissional is null OR c.profissional.nome LIKE :profissional)"
                    + "AND c.status = 'A'");
            
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            consulta.setParameter("data", data.isEmpty() ? null : LocalDate.parse(data, format));
            consulta.setParameter("horario", horario.isEmpty() ? null : "%" + horario + "%");
            consulta.setParameter("paciente", "%" + nomePaciente + "%");
            consulta.setParameter("profissional", "%" + nomeProfissional + "%");
            
            consultas = consulta.getResultList();
        } 
        catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
        return consultas;
    }
    
    /**
     * Obtem o Consulta escolhido na tabela 
     * @param i
     * @return Consulta
     */
    public Consulta obterConsulta(int i) {
        try {
            return manager.find(Consulta.class, i);
        } 
        finally {
            JPAUtil.closeEtityManager();
        }
    }
    
    /**
     * Exclusão de Consulta
     * @param c 
     */
    public void excluirConsulta(Consulta c) {
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
     * Retorna a quantidade de consultas agendadas 
     * @return long
     */
    public long consultasAgendadas() {
        String consulta = "SELECT COUNT(c) FROM Consulta c WHERE c.status = 'A'";
        
        TypedQuery<Long> query = manager.createQuery(consulta, Long.class);
        
        return query.getSingleResult();
    }
    
    /**
     *  Retorna a quantidade de consultas finalizadas 
     * @return long
     */
    public long consultasFinalizadas() {
        String consulta = "SELECT COUNT(c) FROM Consulta c WHERE c.status = 'I'";
        
        TypedQuery<Long> query = manager.createQuery(consulta, Long.class);
        
        return query.getSingleResult();
    }
    
    /**
     * Atualização de Consulta 
     * @param c 
     */
    public void atualizar(Consulta c) {
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
