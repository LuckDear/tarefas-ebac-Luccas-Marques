package exceptions;

public class ExemplosExceptions {
    public static void main(String[] args) {
       // semTratamentoException();
        comTratamentoException();
        //comTratamentoExceptioncomFinally();
       // lancarRuntimeException();
        //System.out.println("Teste");

    }

    private static void comTratamentoExceptioncomFinally() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e){
            //Tratamento da execução
            System.out.println("A frase inicial está nula, para solucionar o problema foi atribuido um novo valor.");
            frase = "frase vazia";
        }finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void lancarRuntimeException() {
        try {
            String frase = null;
            String novaFrase = frase.toUpperCase();
        }catch (Exception e){
            throw new RuntimeException("Parando Sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoException(){
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e){
            //Tratamento da execução
            System.out.println("A frase inicial está nula, para solucionar o problema foi atribuido um novo valor.");
            frase = "frase vazia";
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

    private static void semTratamentoException() {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }

}
