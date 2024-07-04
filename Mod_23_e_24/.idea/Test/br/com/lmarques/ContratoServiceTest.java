package br.com.lmarques;

import br.com.lmarques.dao.ContratoDao;
import br.com.lmarques.dao.IContratoDao;
import br.com.lmarques.mock.ContratoDaoMock;
import br.com.lmarques.service.ContratoService;
import br.com.lmarques.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso",retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso",retorno);
    }
}
