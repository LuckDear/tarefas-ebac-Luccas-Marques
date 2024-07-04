package br.com.lmarques;

import br.com.lmarques.dao.ClienteDao;
import br.com.lmarques.dao.IClienteDao;
import br.com.lmarques.mock.ClienteDaoMock;
import br.com.lmarques.service.ClienteService;
import br.com.lmarques.service.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        IClienteDao dao = new ClienteDaoMock();
        IClienteService cliente = new ClienteService(dao);
        String retorno = cliente.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNosalvarTest(){
        IClienteDao dao = new ClienteDao();
        ClienteService cliente = new ClienteService(dao);
        String retorno = cliente.salvar();
        Assert.assertEquals("sucesso", retorno);
    }
    @Test
    public void buscarTest(){
        IClienteDao dao = new ClienteDaoMock();
        IClienteService cliente = new ClienteService(dao);
        String retorno = cliente.buscar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoBuscarTest(){
        IClienteDao dao = new ClienteDao();
        ClienteService cliente = new ClienteService(dao);
        String retorno = cliente.buscar();
        Assert.assertEquals("sucesso", retorno);
    }
    @Test
    public void excluirTest(){
        IClienteDao dao = new ClienteDaoMock();
        IClienteService cliente = new ClienteService(dao);
        String retorno = cliente.excluir();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoExcluirTest(){
        IClienteDao dao = new ClienteDao();
        ClienteService cliente = new ClienteService(dao);
        String retorno = cliente.excluir();
        Assert.assertEquals("sucesso", retorno);
    }
    @Test
    public void atualizarTest(){
        IClienteDao dao = new ClienteDaoMock();
        IClienteService cliente = new ClienteService(dao);
        String retorno = cliente.atualizar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoAtualizarTest(){
        IClienteDao dao = new ClienteDao();
        ClienteService cliente = new ClienteService(dao);
        String retorno = cliente.atualizar();
        Assert.assertEquals("sucesso", retorno);
    }
}
