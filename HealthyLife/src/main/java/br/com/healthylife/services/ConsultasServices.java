package br.com.healthylife.services;

import br.com.healthylife.persistence.ConsultaDAO;

public class ConsultasServices {
    
    /**
     * Intermédio para chamar a contagem de consultas agendadas
     * @return long
     */
    public long consultasAgendadasServices() {
        return new ConsultaDAO().consultasAgendadas();
    }
    
    /**
     * Intermédio para chamar a contagem de consultas finalizadas 
     * @return long
     */
    public long consultasFinalizadasServices() {
        return new ConsultaDAO().consultasFinalizadas();
    }
 }
