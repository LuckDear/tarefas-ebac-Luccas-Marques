package dao;

import Domain.Produto;

import java.util.Collection;
import java.util.Collections;

public interface IProdutoDAO {
    public boolean cadastrar(Produto produto);
    public void excluir(Long codigo);
    public void alterar(Produto produto);
    public Produto consultar(Long nome);
    public Collection<Produto> buscarTodos();
}
