public class MainSyncronized {
    public static void main(String[]args) {

        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
}
    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("teste1");
            System.out.println(singleton.getValue());
        }
    }
}
