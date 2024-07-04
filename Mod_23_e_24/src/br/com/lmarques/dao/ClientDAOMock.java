package br.com.lmarques.dao;

public class ClientDAOMock implements IClientDAO{
    @Override
    public String salvar() {
        return "sucesso";
    }
}
