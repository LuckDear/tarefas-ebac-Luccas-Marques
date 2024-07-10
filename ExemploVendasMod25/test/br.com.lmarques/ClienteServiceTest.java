package br.com.lmarques;

import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.dao.mock.ClienteDaoMock;
import br.com.lmarques.exception.TipoChaveNaoEncontradaException;
import br.com.lmarques.service.ClienteService;
import br.com.lmarques.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(1234567890L);
        cliente.setNome("Luccas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);


    }
    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Luccas Marques");
        clienteService.alterar(cliente);
        Assert.assertEquals("Luccas Marques", cliente.getNome());
    }
}
