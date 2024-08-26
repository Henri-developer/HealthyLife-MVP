package br.com.healthylife.services;

import br.com.healthylife.persistence.ProfissionalDAO;

public class ProfissionaisServices {
    
    /**
     * Intermédio para chamar a contagem de profissionais 
     * @return long
     */
    public long profissionaisTotaisServices() {
        return new ProfissionalDAO().profissionaisTotais();
    }
}
