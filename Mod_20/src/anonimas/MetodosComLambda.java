package anonimas;

public class MetodosComLambda {
    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> imprimir(s);
        myEvent1.consumer("ola1");
    }
    private static void imprimir(Object t){
        System.out.println(t);
    }
}
