import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TesteRealizaOperacao {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        System.out.println("Multiplica todos os elementos por 5: ");

        realizaOperacao(list, (n) -> n * 5);

        System.out.println("Soma 3 em todos os elementos das lista: ");
        realizaOperacao(list, (n) -> n + 3);

        System.out.println("Coloca 0 em todos os elementos da lista:");
        realizaOperacao(list, (n) -> 0);
    }
    public static void realizaOperacao(List<Integer> list, IntFunction<Integer> function){
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}
