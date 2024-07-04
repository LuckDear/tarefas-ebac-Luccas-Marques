package br.com.lmarques.dao;

import br.com.lmarques.service.IContratoService;

public class ContratoDao implements IContratoDao {
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("não funciona sem banco");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("não funciona sem banco");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("não funciona sem banco");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("não funciona sem banco");
    }
}
