package br.com.lmarques.service;

import br.com.lmarques.dao.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao contratoDao;

    public ContratoService (IContratoDao dao){
        this.contratoDao = dao;
    }
    @Override
    public String salvar() {
        contratoDao.salvar();

        return "sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "sucesso";
    }

    @Override
    public String exluir() {
        contratoDao.excluir();
        return "sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "sucesso";
    }

}
