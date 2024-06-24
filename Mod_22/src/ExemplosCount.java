import java.util.List;
import java.util.stream.Stream;

public class ExemplosCount {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        Long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
