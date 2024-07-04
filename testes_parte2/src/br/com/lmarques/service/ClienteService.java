package br.com.lmarques.service;

import br.com.lmarques.dao.IClienteDao;

public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao dao){
        this.clienteDao = dao;
    }
    public String salvar() {
        clienteDao.salvar();
        return "sucesso";
    }

    @Override
    public String buscar() {
        clienteDao.buscar();
        return "sucesso";
    }

    @Override
    public String excluir() {
        clienteDao.excluir();
        return "sucesso";
    }

    @Override
    public String atualizar() {
        clienteDao.atualizar();
        return "sucesso";
    }
}