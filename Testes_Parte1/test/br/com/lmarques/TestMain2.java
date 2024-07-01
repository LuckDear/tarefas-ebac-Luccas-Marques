package br.com.lmarques;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestMain2 {
    @Test
    public void validaFeminino() {
        ProcessaNome processa = new ProcessaNome();
        String entrada = "joao -m, joana -f, maria -f, cleber -m";

        List<String> feminino = processa.processaNomesFemininos(entrada);
        Assert.assertEquals(2, feminino.size());

        Assert.assertTrue(feminino.stream().allMatch(f -> f.endsWith("f")));
        boolean consulta = processa.verificaTodosFemininos(entrada);
        Assert.assertFalse(consulta);
    }

    @Test
    public void validaMasculino(){
        ProcessaNome processa = new ProcessaNome();
        String entrada = "joao -m, joana -f, maria -f, cleber -m";

        List<String> masculino = processa.processaNomesMasculinos(entrada);
        Assert.assertEquals(2,masculino.size());

        Assert.assertTrue(masculino.stream()
                .allMatch(m -> m.endsWith("m")));
        boolean consulta = processa.verificaTodosMasculinos(entrada);
        Assert.assertFalse(consulta);
    }
}
