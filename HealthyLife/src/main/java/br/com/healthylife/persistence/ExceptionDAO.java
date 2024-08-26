package br.com.healthylife.persistence;

public class ExceptionDAO extends Exception{
    
    public ExceptionDAO(String mensagem){
        super(mensagem); 
    }
}
