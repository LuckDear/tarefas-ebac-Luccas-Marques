import java.util.Collection;

public interface IGenericDAO <T extends IPersistente> {
    public boolean cadastrar(T entity);
    Carros excluir(Long valor);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}

