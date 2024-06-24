package anonimas;

public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anonima");

        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste lambda");

        recebeInterface((Object value) -> System.out.println(value));
    }
    private static void recebeInterface(MyEventConsumer anonimaLambda){
        anonimaLambda.consumer("Ola");
    }
}
