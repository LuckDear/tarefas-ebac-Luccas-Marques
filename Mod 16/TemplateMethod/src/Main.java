public class Main {
    public static void main(String[] args) {

        Trabalhador trabalhador;
        trabalhador = new Bombeiro();
        trabalhador.executarRotina();
        trabalhador = new Policial();
        trabalhador.executarRotina();
    }
}