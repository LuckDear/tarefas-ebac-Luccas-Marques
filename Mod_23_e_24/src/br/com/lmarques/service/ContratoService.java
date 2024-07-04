package br.com.lmarques.service;

import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.service.IContratoService;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "sucesso";
    }
}
