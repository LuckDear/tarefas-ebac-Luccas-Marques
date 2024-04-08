public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            SingletonPropriedade singleton = SingletonPropriedade.getInstance("teste1");
            System.out.println(singleton.getValue());
        }
    }
}