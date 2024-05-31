package Observer;

public class Main {
    public static void main(String[] args) {

        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("teste");
    }
}
