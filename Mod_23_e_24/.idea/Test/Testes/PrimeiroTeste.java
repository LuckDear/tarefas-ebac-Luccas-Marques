package Testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void test(){
        String nome = "Luccas";
        Assert.assertEquals("Luccas", nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "Luccas";
        Assert.assertNotEquals("Luccas1",nome);
    }

}