import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = s.nextInt();

        if (num == 1){
            System.out.println("Resultado igual a 1");
        } else if (num > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }
    }
}