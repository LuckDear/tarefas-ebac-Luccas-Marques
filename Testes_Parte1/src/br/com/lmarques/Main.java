package br.com.lmarques;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcessaNome processa = new ProcessaNome();
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os nomes separados por ',' e o sexo separado por '-' Exemplo: joao - m, joana - f ");
        String entrada = s.nextLine();

        List<String> feminino = processa.processaNomesFemininos(entrada);
        System.out.println("Lista de nomes femininos:");
        feminino.forEach(System.out::println);

        boolean consultaFeminino = feminino.stream()
                .allMatch(f -> f.endsWith("f"));
        System.out.println(consultaFeminino);


        List<String> masculino = processa.processaNomesMasculinos(entrada);
        System.out.println("Lista de nomes masculinos: ");
        masculino.forEach(System.out::println);

        boolean consultaMasculino = masculino.stream()
                .allMatch(f -> f.endsWith("m"));
        System.out.println(consultaMasculino);
    }
}