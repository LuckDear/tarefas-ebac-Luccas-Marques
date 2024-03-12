// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operadoresRelacionais();
    }

    private static void operadoresRelacionais() {
        System.out.println("Operações Relacionais");
        int num1 = 10;
        int num2 = 10;

        boolean isMaior = num1 > num2;
        System.out.println(isMaior);

        boolean isIgual = num1 == num2;
        System.out.println(isIgual);

        boolean isDiff = num1 != num2;
        System.out.println(isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println(isMaiorIgual);

        boolean isMenor = num1 < num2;
        System.out.println(isMenor);

        boolean isMenorIgual = num1 <= num2;
        System.out.println(isMenorIgual);
    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("Operações de Incremento e Decremento");
        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("Opecações de atribuições");
        int numero1 = 10;
        int numero2 =10;
        int numero3 = 30;
        numero3 += numero2;

        System.out.println(numero3);
    }

    public static void operacoesAritmeticas(){
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (num1 + 10) / 2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

    }
}