package br.com.lmarques;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestMain2 {
    @Test
    public void validaFeminino(){
        DivideNomes nomes = new DivideNomes();

        String amostra = "joao -m, joana -f, maria -f, cleber -m";

        List<String> feminino = nomes.divideFeminino(amostra);
        Assert.assertEquals(2, feminino.size());

        Assert.assertTrue(feminino.stream()
                .allMatch(f -> f.endsWith("f")));
        boolean consultaFeminino = nomes.consultaFeminino(amostra);
        Assert.assertFalse(consultaFeminino);
    }

    @Test
    public void validaMasculino(){
        DivideNomes nomes = new DivideNomes();

        String amostra = "joao -m, joana -f, maria -f, cleber -m";

        List<String> masculino = nomes.divideMasculino(amostra);
        Assert.assertEquals(2, masculino.size());

        Assert.assertTrue(masculino.stream()
                .allMatch(m -> m.endsWith("m")));
        boolean consultaMasculino = nomes.consultaMasculino(amostra);
        Assert.assertFalse(consultaMasculino);
    }

}
