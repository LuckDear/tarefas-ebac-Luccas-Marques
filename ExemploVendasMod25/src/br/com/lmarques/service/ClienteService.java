package br.com.lmarques.service;

import br.com.lmarques.Cliente;
import br.com.lmarques.dao.ClienteDao;
import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService{

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao dao){
        this.clienteDao = dao;
    }
    @Override
    public boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDao.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDao.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDao.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDao.alterar(cliente);
    }
}
