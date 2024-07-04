package br.com.lmarques.service;

import br.com.lmarques.dao.ClientDAO;
import br.com.lmarques.dao.ClientDAOMock;
import br.com.lmarques.dao.IClientDAO;

public class ClientService {
    private IClientDAO clientDAO;
    public ClientService(IClientDAO clientDAO){
        //clientDAO = new ClientDAOMock();
        //clientDAO = new ClientDAO();
        this.clientDAO = clientDAO;
    }
    public String salvar(){
        clientDAO.salvar();
        return "sucesso";
    }
}
