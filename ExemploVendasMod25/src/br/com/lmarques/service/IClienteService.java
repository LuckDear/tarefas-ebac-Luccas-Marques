package br.com.lmarques.service;

import br.com.lmarques.Cliente;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;

public interface IClienteService {


    boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
