public class MainLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Teste1");
        logger.log("Test2");

        Logger logger1 = Logger.getInstance();
        logger1.log("Teste3");

        System.out.println(logger == logger1);
    }
}
