public class Main {
    public static void main(String[] args) {
        percorrendoArray2();
        percorrendoArray1();
        arrayBidimensional();
    }

    private static void percorrendoArray2() {
            System.out.println("****** percorrendoArray2 ******");
            int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
            int total = 0;
            for (int i = 0; i < arrayNum.length; i++) {
                System.out.println("Posição " + i + ": " + arrayNum[i]);
            }

        }
    private static void percorrendoArray1() {
        System.out.println("****** percorrendoArray1 ******");
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum) {
            total += i;

        }
        System.out.println(total);
    }

    private static void arrayBidimensional() {
        System.out.println("****** arrayBidimensional ******");
        int[][] array1 = { { 1,2,3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };

        System.out.println("Valores no array1 passados na linha são");
        outputArray( array1 ); //exibe o array 2 por linha

        System.out.println("Valores no array2 passados na linha são");
        outputArray( array2 ); //exibe o array 2 por linha
    }

    public static void outputArray(int [][] array){
        for (int linha = 0; linha < array.length; linha++){
            for (int coluna = 0; coluna < array[linha].length; coluna++){
                System.out.printf("%d ",array[linha][coluna]);
            }
            System.out.println();
        }
    }
}