package br.com.lmarques;

import br.com.lmarques.dao.ContratoDao;
import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.mock.ContratoDaoMock;
import br.com.lmarques.service.ClienteService;
import br.com.lmarques.service.ContratoService;
import br.com.lmarques.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoSalvarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.buscar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoBuscarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.buscar();
        Assert.assertEquals("sucesso", retorno);
    }
    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.exluir();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoexcluirTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.exluir();
        Assert.assertEquals("sucesso", retorno);
    }
    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.atualizar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoAtualizarTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService contrato = new ContratoService(dao);
        String retorno = contrato.atualizar();
        Assert.assertEquals("sucesso", retorno);
    }
}
