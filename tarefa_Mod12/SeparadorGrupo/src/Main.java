import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exibeNomeSexo();
    }

    private static void exibeNomeSexo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira os nomes separados por ',' e o sexo separado por '-' Exemplo: joao - m, joana - f ");
        String entrada = s.nextLine();

        String[] pessoas = entrada.split(",");

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            if (sexo.equalsIgnoreCase("m")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("f")) {
                feminino.add(nome);
            }
        }
        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Nomes masculinos");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Nomes Femininos");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}