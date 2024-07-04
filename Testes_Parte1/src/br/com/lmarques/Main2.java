package br.com.lmarques;

import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        DivideNomes nomes = new DivideNomes();
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os nomes separados por ',' e o sexo separado por '-' Exemplo: joao - m, joana - f ");
        String entrada = s.nextLine();

        List<String> feminino = nomes.divideFeminino(entrada);
        System.out.println("Lista de nomes femininos: ");
        feminino.forEach(System.out::println);

        boolean consultaFeminino = feminino.stream().allMatch(f -> f.endsWith("f"));
        System.out.println(consultaFeminino);

        List<String> masculino = nomes.divideMasculino(entrada);
        System.out.println("Lista de nomes masculinos");
        masculino.forEach(System.out::println);

        boolean consultaMasculino = masculino.stream()
                .allMatch(m -> m.endsWith("m"));
        System.out.println(consultaMasculino);
    }
}
