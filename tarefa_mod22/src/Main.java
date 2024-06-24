import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os nomes separados por ',' e o sexo separado por '-' Exemplo: joao - m, joana - f ");
        String entrada = s.nextLine();

        List<String> feminino = List.of(entrada.split(","));

        System.out.println("Lista de nomes femininos:");

        feminino.stream()
                .filter(f -> f.endsWith("f"))
                .forEach(System.out::println);

        System.out.println("Lista de nomes Masculinos:");

        List<String> masculino = List.of(entrada.split(","));

        masculino.stream()
                .filter(m -> m.endsWith("m"))
                .forEach(System.out::println);
    }
}