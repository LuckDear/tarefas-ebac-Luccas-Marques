import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.file.Files;

@Tabela("Teste Tabela")
public class Main {
    public static void main(String[] args) {
        executaNomeTabela();
    }

    private static void executaNomeTabela() {
        ProdutoReflection prod = new ProdutoReflection();
        if (prod.getClass().isAnnotationPresent(Tabela.class)){
            Tabela tab = prod.getClass().getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tab.value());
        }
    }
}