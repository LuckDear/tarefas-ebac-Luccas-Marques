import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends IPersistente> implements IGenericDAO<T> {

    protected Map<Class, Map<Long, T>> map;

    public abstract Class getTipoClasse();

    public abstract void atualizarDados(T entity, T objetoCadastrado);

    public GenericDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno.containsKey(entity.getCodigo())){
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public Carros excluir(Long valor) {
        Map mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = (T) mapaInterno.remove(valor);
        return (Carros) objetoCadastrado;
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
