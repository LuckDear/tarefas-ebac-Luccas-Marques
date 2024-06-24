package anonimas;

public class ReferenciaMetodos {
    public static void main(String[] args) {
        MyEventConsumer myEvent = s -> System.out.println(s);
        myEvent.consumer("Ola1");

        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Ola2");
    }
}
