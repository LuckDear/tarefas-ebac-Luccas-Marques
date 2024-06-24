import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TesteAvaliaExpressao {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

        System.out.println("Imprime todos os numeros");
        avaliarExpressao(list, (n) -> true);

        System.out.println("Não imprime nenhum numero: ");
        avaliarExpressao(list, (n)->false);

        System.out.println("Imprime apenas numeros impares: ");
        avaliarExpressao(list, (n) -> n%2 == 1);

        System.out.println("Imprime apenas numeros pares: ");
        avaliarExpressao(list, (n) -> n%2 == 0);

        System.out.println("Imprime apenas numeros maiores que 5: ");
        avaliarExpressao(list, (n) -> n > 5);

    }
    public static void avaliarExpressao(List<Integer> list, Predicate<Integer> predicate){
        list.forEach((n) -> {
            if (predicate.test(n)){
                System.out.println(n + " ");
            }
        });
    }
}
