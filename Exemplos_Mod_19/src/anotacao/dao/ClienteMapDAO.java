package anotacao.dao;


import anotacao.Domain.Cliente;
import anotacao.Generic.GenericDAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente objetoCadastrado) {
        objetoCadastrado.setNome(entity.getNome());
        objetoCadastrado.setTel(entity.getTel());
        objetoCadastrado.setNumero(entity.getNumero());
        objetoCadastrado.setEnd(entity.getEnd());
        objetoCadastrado.setCidade(entity.getCidade());
        objetoCadastrado.setEstado(entity.getEstado());
    }


   /* public ClienteMapDAO() {
        super();
        Map<Long, Cliente> mapaInterno =
                (Map<Long, Cliente>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }*/
}
