package anotacao.dao;



import anotacao.Domain.Produto;
import anotacao.Generic.GenericDAO;
import anotacao.SingletonMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
        Map<Long, Produto> mapaInterno =
                (Map<Long, Produto>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }


    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto objetoCadastrado) {
        objetoCadastrado.setNome(entity.getNome());
        objetoCadastrado.setCodigo(entity.getCodigo());
    }
}
