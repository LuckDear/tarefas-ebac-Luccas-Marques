import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemplosSorted {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> stream2 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
    }
}
