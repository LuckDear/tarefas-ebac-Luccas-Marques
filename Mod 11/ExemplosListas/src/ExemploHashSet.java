import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String args[]){
        exemploListasSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploListasSimples(){
        System.out.println("*** Exemplo de litas simples ***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
    }

    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("*** Exemplo de litas simples Ordem Ascendente ***");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        //Collections.sort(lista);
        System.out.println(lista);
    }

    private static void exemploNovo(){
        System.out.println("*** Exemplo Novo ***");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        System.out.println(inteiros);

    }
}
