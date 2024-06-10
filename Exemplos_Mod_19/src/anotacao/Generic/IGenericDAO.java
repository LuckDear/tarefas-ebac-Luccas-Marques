package anotacao.Generic;



import anotacao.Domain.Persistente;
import anotacao.exception.TipoExceptionNaoEncontrada;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public boolean cadastrar(T entity)throws TipoExceptionNaoEncontrada;
    public void excluir(Long valor);
    public void alterar(T entity)throws TipoExceptionNaoEncontrada;
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}
