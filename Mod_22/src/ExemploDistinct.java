import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        Stream<Pessoa> stream1 = lista.stream().distinct();
    }
}
