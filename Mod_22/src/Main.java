import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Lucccas","Marques","Teste").stream();

        Stream<String> set = Set.of("Lucccas","Marques","Teste").stream();

        Map<String, String> map = Map.of("Luccas", "Marques");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("Teste1", "Teste2");

    }
}