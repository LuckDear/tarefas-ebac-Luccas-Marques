package anotacao.Generic;


import anotacao.Domain.Persistente;
import anotacao.anotacao.TipoChave;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T objetoCadastrado);

    public GenericDAO(){
        this.map = new HashMap<>();
    }

    public Long getChave(T entity){
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields){
            if (field.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String metodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(metodo);
                    Long value = (Long) method.invoke(entity);
                    return value;

                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        if (mapaInterno.containsKey(chave)){
            return false;
        }
        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if (objetoCadastrado != null){
            this.map.remove(valor, objetoCadastrado);
        }
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if (objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
