package br.com.lmarques.mock;

import br.com.lmarques.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
    @Override
    public String salvar() {
        return "sucesso";
    }

    @Override
    public String buscar() {
        return "sucesso";
    }

    @Override
    public String excluir() {
        return "sucesso";
    }

    @Override
    public String atualizar() {
        return "sucesso";
    }
}
