import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        exemploListaSimplesOrdenadaClasseExterna();
    }
    private static void exemploListaSimplesOrdenadaClasseExterna(){
        System.out.println("*** exemploListaSimplesOrdenadaClasseExterna ***");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Programação", 20);
        Aluno b = new Aluno("Luccas Marques", "Engenharia", 7);
        Aluno c = new Aluno("Andrea Souza", "Artes", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação: \n" + lista);
        Collections.sort(lista);
        System.out.println("Lista Ordenada: \n" + lista);

        lista.remove(0);
        System.out.println(lista);

        for (Aluno nome : lista){
            System.out.println(nome);
        }

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota: \n" + lista);
    }
}