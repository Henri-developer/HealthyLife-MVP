package br.com.healthylife.controller;

import br.com.healthylife.model.Cliente;
import br.com.healthylife.model.Consulta;
import br.com.healthylife.model.Profissional;
import static br.com.healthylife.view.AgendarConsulta.lblMsgConsulta;
import java.time.LocalDate;
import java.util.List;

public class ConsultaController {
    
    /**
     * Cadastro de Cliente ao Banco de Dados
     * @param nomeCliente
     * @param nomeProfissional
     * @param horarioConsulta
     * @param dataConsulta
     * @param tipo
     * @param eraPaciente 
     */
    public void cadastrarConsulta(Cliente nomeCliente, Profissional nomeProfissional, String horarioConsulta, 
        LocalDate dataConsulta, String tipo, String eraPaciente) {
        Consulta consulta = new Consulta(dataConsulta, horarioConsulta, tipo, eraPaciente, nomeProfissional, nomeCliente, "A");
        consulta.cadastroConsultaModel(consulta);
    }
    
    /**
     * Verifica se o nome do cliente e do profissional foi escolhido  
     * @param cliente
     * @param profissional
     * @return boolean
     */
    public boolean check(String cliente, String profissional) {
        boolean sucesso = true;
        
        if(cliente.isEmpty()) {
            lblMsgConsulta.setText("Nome do cliente inválido");
            sucesso = false;
        } else if(profissional.isEmpty()) {
            lblMsgConsulta.setText("Nome do profissional inválido");
             sucesso = false;
        }
        return sucesso;
    }
    
    /**
     * Verifica campos nulos ou formatos inválidos passando como parâmetro os dados para o método validFild
     * @param horaConsulta
     * @param dataConsulta
     * @return boolean
     */
    public boolean checkFields(String nomeCliente, String nomeProfissional, String horaConsulta, String dataConsulta) {
        if(!validField(nomeCliente, "^[a-zA-ZÀ-ÿ\\s]+$", "Nome do cliente inválido")) {
            return false;
        }
        if(!validField(nomeProfissional, "^[a-zA-ZÀ-ÿ\\s]+$", "Nome do profissional inválido")) {
            return false;
        }
        if(!validField(horaConsulta, "[0-9]{2}[:][0-9]{2}", "Horário inválido")) {
            return false;
        }
        if(!validField(dataConsulta, "[0-9]{2}[/][0-9]{2}[/][0-9]{4}", "Data inválida")) {
            return false;
        }
        return true;
    }
            
    /**
     * Verifica se possui campos nulos ou inválidos
     * @param field
     * @param format
     * @param erroMassage 
     */
    public boolean validField(String field, String format, String erroMessage) {
        if(field == null || !field.matches(format)) {
            lblMsgConsulta.setText(erroMessage);
            return false;
        }
        return true;
    }
    
    /**
     * Valida o formato da Data na busca de consultas 
     * @param data
     * @return boolean
     */
    public boolean validData(String data) {
        boolean check = false;
        
        check = data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        
        if(check) {
            check = true;
        }
        return check;
    }
    
    /**
     * Valida o formato do Horário na busca de consultas 
     * @param horario
     * @return boolean
     */
    public boolean validHorario(String horario) {
        boolean check = false;
        
        check = horario.matches("[0-9]{2}[:][0-9]{2}");
        
        if(check) {
            check = true;
        }
        return check;
    }
    
    /**
     * Intermédio para buscar Consulta
     * @param data
     * @param horario
     * @param paciente
     * @param profissional
     * @return Consulta
     */
    public List<Consulta> buscarConsultaController(String data, String horario, String paciente, String profissional) {
        return new Consulta().buscarConsultaModel(data, horario, paciente, profissional);
    }
    
    /**
     * Intermédio para obter o Consulta e realizar sua exclusão   
     * @param i
     * @return Consulta
     */
    public Consulta obterConsultaController(int i) {
        return new Consulta().obterConsultaModel(i);
    }
    
    /**
     * Intermédio para excluir Consulta 
     * @param c 
     */
    public void excluirConsultaController(Consulta c) {
        new Consulta().excluirConsultaModel(c);
    }
    
    /**
     * Intermédio para editar o cadastro de Consulta   
     * @param c 
     */
    public void atualizarConsultaController(Consulta c) {
        new Consulta().atualizarConsultaModel(c);
    } 
}
