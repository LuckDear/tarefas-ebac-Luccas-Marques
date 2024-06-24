public class TesteLambdaThreads {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Executando lambda");
        new Thread(rLambda).start();

        new Thread(() -> System.out.println("Executando lambda 1")).start();

    }
}
