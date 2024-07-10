package br.com.lmarques;

import br.com.lmarques.dao.ClienteDao;
import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.dao.mock.ClienteDaoMock;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {
    private IClienteDao clienteDao;
    private Cliente cliente;

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(1234567890L);
        cliente.setNome("Luccas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);

        clienteDao.cadastrar(cliente);
    }

    public ClienteDaoTest(){
        clienteDao = new ClienteDaoMock();
    }

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException {
        Boolean clienteConsultado = clienteDao.cadastrar(cliente);

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteDao.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Luccas Marques");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Luccas Marques", cliente.getNome());
    }
}
