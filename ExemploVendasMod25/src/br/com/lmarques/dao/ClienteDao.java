package br.com.lmarques.dao;

import br.com.lmarques.Cliente;
import br.com.lmarques.Persistente;
import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.dao.generics.GenericDao;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public class ClienteDao extends GenericDao<Cliente, Serializable> implements IClienteDao {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }

    public ClienteDao(){
        super();
    }


    @Override
    public Cliente consultar(Long valor) {
        return null;
    }

    @Override
    public void excluir(Serializable valor) {

    }

    @Override
    public Cliente consultar(Serializable valor) {
        return null;
    }
}
