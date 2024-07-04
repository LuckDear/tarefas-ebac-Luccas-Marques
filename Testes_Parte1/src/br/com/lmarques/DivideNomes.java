package br.com.lmarques;

import java.util.List;
import java.util.stream.Collectors;

public class DivideNomes {
    public List<String> divideFeminino (String entrada){
        List<String> feminino = List.of(entrada.split(","));
        return feminino.stream()
                .filter(f -> f.endsWith("f"))
                .collect(Collectors.toList());
    }

    public List<String> divideMasculino (String entrada){
        List<String> masculino = List.of(entrada.split(","));
        return masculino.stream()
                .filter(m -> m.endsWith("m"))
                .collect(Collectors.toList());
    }

    public boolean consultaFeminino(String entrada){
        List<String> feminino = List.of(entrada.split(","));
        return feminino.stream()
                .allMatch(f -> f.endsWith("f"));
    }

    public boolean consultaMasculino(String entrada){
        List<String> masculino = List.of(entrada.split(","));
        return masculino.stream()
                .allMatch(m -> m.endsWith("m"));
    }
}
