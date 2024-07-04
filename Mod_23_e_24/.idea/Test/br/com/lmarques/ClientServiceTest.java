package br.com.lmarques;

import br.com.lmarques.dao.ClientDAO;
import br.com.lmarques.dao.ClientDAOMock;
import br.com.lmarques.dao.IClientDAO;
import br.com.lmarques.service.ClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {

    @Test
    public void salvarTest(){
        IClientDAO mock = new ClientDAOMock();
        ClientService service = new ClientService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNosalvarTest(){
        IClientDAO dao = new ClientDAO();
        ClientService service = new ClientService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }
}
