package br.com.lmarques.dao.mock;

import br.com.lmarques.Cliente;
import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Serializable valor) {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf((Long) valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Serializable valor) {
        return null;
    }
}
