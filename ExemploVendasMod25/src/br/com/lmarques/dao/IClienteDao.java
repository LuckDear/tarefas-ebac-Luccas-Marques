package br.com.lmarques.dao;

import br.com.lmarques.Cliente;
import br.com.lmarques.dao.generics.IGenericDao;

import java.io.Serializable;

public interface IClienteDao extends IGenericDao<Cliente, Serializable> {
    Cliente consultar(Long valor);

    //boolean salvar(Cliente cliente);
    //Cliente buscarPorCPF(Long cpf);

    //void excluir(Long cpf);

    //void alterar(Cliente cliente);
}
