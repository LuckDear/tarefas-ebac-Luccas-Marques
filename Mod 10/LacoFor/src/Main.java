import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para gerar a tabuada: ");
        int tab = s.nextInt();

        for (int i = 0; i <= 10; i++){
            int resultado = tab * i;
            System.out.println(tab + " X " + i + " = " + resultado);
        }
    }
}