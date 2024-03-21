import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String args[]){
        exemploListaSimples();
        exemploConsultando();

    }

    private static void exemploConsultando() {
        System.out.println("*** Exemlpo Consulta ***");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Java", 0);
        Aluno b = new Aluno("Antonio Sousa", "Pacote Office", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "Pacote Office",10);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(a));
    }

    private static void exemploListaSimples(){
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Java", 0);
        Aluno b = new Aluno("Antonio Sousa", "Pacote Office", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "Pacote Office",10);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
