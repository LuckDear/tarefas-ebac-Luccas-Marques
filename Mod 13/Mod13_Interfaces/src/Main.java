public class Main {
    public static void main(String[] args) {

        ICaneta caneta = new Caneta();

        caneta.escrever("Olá Luccas");
        System.out.println(caneta.getCor());
        caneta.escritaComum();
        ICaneta giz = new Giz();

        giz.escrever("Olá Luccas");
        giz.escritaComum();
        System.out.println(giz.getCor());


        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Luccas");
        lapis.escritaComum();
        System.out.println(lapis.getCor());
    }
}