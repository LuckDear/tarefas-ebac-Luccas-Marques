package br.com.lmarques;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestMain {
    @Test
            public void validaFeminino() {

        String userInput = String.format("luccas -m, lua -f, fabi -f, julia -f, joao -m, fagner -m", System.lineSeparator(), System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String esperada = "lua -f, fabi -f, julia -f";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Main.main(null);

        String[] linhas = baos.toString().split(System.lineSeparator());
        String atual = linhas[linhas.length-1];

        Assert.assertEquals(esperada, atual);

    }

}
