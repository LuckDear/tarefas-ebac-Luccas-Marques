public class Main {
    public static void main(String[] args) {
        CalculoMedia calculoMedia = new CalculoMedia();
        System.out.println("Nota 1: " + calculoMedia.getNota1());
        System.out.println("Nota 2: " + calculoMedia.getNota2());
        System.out.println("Nota 3: " + calculoMedia.getNota3());
        System.out.println("Nota 4: " + calculoMedia.getNota4());

        System.out.print("A média final do aluno é: ");
        System.out.println(calculoMedia.mediaFinal());
    }
}