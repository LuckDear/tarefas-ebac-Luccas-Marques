package dao;

import Domain.Produto;

import java.util.Collection;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public boolean cadastrar(Produto produto) {
        return false;
    }

    @Override
    public void excluir(Long codigo) {

    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public Produto consultar(Long nome) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
