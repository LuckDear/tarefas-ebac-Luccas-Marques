import java.util.List;

public class ExemplosForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("********");
        System.out.println("********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("********");
        System.out.println("********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));
    }
}
