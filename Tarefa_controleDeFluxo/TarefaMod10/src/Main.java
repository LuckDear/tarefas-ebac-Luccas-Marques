import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = s.nextInt();

        double geral = (nota1 + nota2 + nota3 + nota4)/4;

        if (geral < 5){
            System.out.println("nota final: " + geral + "\nAluno Reprovado.");
        } else if (geral >= 5 && geral < 7 ) {
            System.out.println("nota final: " + geral + "\nAluno de Recuperação");
        }else {
            System.out.println("nota final: " + geral + "\nAluno Aprovado");
        }
    }
}