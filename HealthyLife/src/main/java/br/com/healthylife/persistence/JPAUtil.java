package br.com.healthylife.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT = "NutriWeb-PU";
    
    /**
     * Gerenciador de entidades e relacionamentos 
     */
    private static EntityManager manager;
    private static EntityManagerFactory factory;
    
    /**
     * Conexão com Banco de Dados 
     * @return manager
     */
    public static EntityManager getEntityManager() {
        if(factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }
        return manager;
    }
    
    /**
     * Desconeta do Banco de Dados
     */
    public static void closeEtityManager() {
        if(manager.isOpen() && manager != null) {
            manager.close();
            factory.close();
        }
    }
}
