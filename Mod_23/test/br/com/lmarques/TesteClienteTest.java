package br.com.lmarques;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void TesteClienteTest(){
        ClienteTeste cli = new ClienteTeste();
        cli.adicionarNome("Luccas");
        cli.adicionarNome1("Luccas");

        Assert.assertEquals("Luccas", cli.getNome());
    }
}
