package Generic;

import Domain.Persistente;
import Domain.Produto;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}
