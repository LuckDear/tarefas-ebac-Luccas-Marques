package anonimas;

public class QuandoUtilizarParenteses {
    public static void main(String[] args) {
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent2 = s -> System.out.println(s);

//Mais de uma linha no lambda é necessario usar chaves {}
        MyEventConsumer myEvent3 = s -> {

            System.out.println(s);
            System.out.println(s);
        };
        myEvent2.consumer("as");

        MyConsumerReturn ret =  s -> {
            System.out.println(s);
            return 1;
        };

        MyConsumerReturn<String> retS =  s -> {
            System.out.println(s);
            return "Ola";
        };
        retS.consumer("Teste");

        MyConsumerReturn<String> returnS = s -> imprimir(s);
        returnS.consumer("Teste");
    }

    private static <T> T imprimir(T value){
        System.out.println(value);
        return value;
    }
}
