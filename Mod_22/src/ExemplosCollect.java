import java.util.*;
import java.util.stream.Collectors;

public class ExemplosCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());

        listaB.forEach(System.out::println);

        System.out.println("**********");
        System.out.println("**********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**********");
        System.out.println("**********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet())
                        .forEach(System.out::println);

        System.out.println("**********");
        System.out.println("**********");

        ArrayList<Pessoa> array = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));

        array.forEach(System.out::println);

        System.out.println("**********");
        System.out.println("**********");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        map.forEach((k, v) -> System.out.println(v));

        System.out.println("**********");
        System.out.println("**********");

        Map<Integer, List<Pessoa>> agrupaIdade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        agrupaIdade.forEach((k, v) -> System.out.println(k + " / " + v));

        System.out.println("**********");
        System.out.println("**********");

        Map<String, List<Pessoa>> agrupaNacionalidade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade));

        agrupaNacionalidade.forEach((k, v) -> System.out.println(k + " / " + v));

        System.out.println("**********");
        System.out.println("**********");

        Map<String, Integer> grupoPorNacionalidadeSomadosIdade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade,
                        Collectors.summingInt(Pessoa::getIdade)));

        grupoPorNacionalidadeSomadosIdade.forEach((k, v) -> System.out.println(k + " / " + v));
    }
}
