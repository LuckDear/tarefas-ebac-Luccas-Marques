import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        int resultado = intBinaryOperator.applyAsInt(1,1);
        System.out.println(resultado);

        BiFunction<Integer,Integer,Integer> biFunction = (Integer a, Integer b) ->{
            return a + b;
        };
        Integer resultBi = biFunction.apply(10, 10);
        System.out.println(resultBi);

        BiFunction<Double, Double, String> biFunction2 = (Double a, Double b) -> {
            Double res = a + b;
            return String.valueOf(res);
        };
        String biFunction1 = biFunction2.apply(10d,10d);
        System.out.println("String: " + biFunction1);

        Long resLong = calcular(3l,5l,(Long a, Long b) -> {
           return a+b;
        });
        System.out.println(resLong);

        System.out.println(calcular(3l,5l,(Long a, Long b) -> {
            return a+b;
        }));

        Runnable helloWorld = () -> System.out.println("Olá mundo");

        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("value");

        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> doubleCallable = () -> {
            return 2d;
        };
    }

    private static Long calcular(Long t, Long u, BiFunction<Long,Long,Long> function){
        return function.apply(t,u);
    }
}