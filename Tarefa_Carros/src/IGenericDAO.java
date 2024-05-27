import java.util.Collection;

public interface IGenericDAO <T extends IPersistente> {
    public boolean cadastrar(T entity);
    Carros excluir(String valor);
    public T consultar(String valor);
    public Collection<T> buscarTodos();
}

