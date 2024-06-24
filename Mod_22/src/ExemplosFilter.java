import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        //Primeiro modelo para utilizar o filter de uma stream:
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        stream.forEach(pessoa -> System.out.println(pessoa.getNome()));

        //Segundo modelo para utilizar o filter de uma stream:
        Predicate<Pessoa> predicate = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream<Pessoa> stream1 = lista.stream().filter(predicate);

        stream1.forEach(pessoa -> System.out.println(pessoa.getNome()));

        //Terceiro modelo para utilizar o filter de uma stream:
        Predicate<Pessoa> predicate1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };
        Stream<Pessoa> stream2 = lista.stream().filter(predicate1);

        stream2.forEach(pessoa -> System.out.println(pessoa.getNome()));

        //Quarto modelo para utilizar o filter de uma stream:
        Stream<Pessoa> stream3 = lista.stream().filter(new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        });

        stream3.forEach(pessoa -> System.out.println(pessoa.getNome()));

    }
}
