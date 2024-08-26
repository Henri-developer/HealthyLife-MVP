package br.com.healthylife.services;

import br.com.healthylife.persistence.ClienteDAO;

public class PacientesServices {
    
    /**
     * Intermédio para chamar a contagem de pacientes
     * @return long
     */
    public long pacientesTotaisServices() {
        return new ClienteDAO().pacientesTotais();
    }
}
