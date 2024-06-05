package exceptions;

import exceptions.ExemploThrow;
import exceptions.LimiteSaqueException;

public class Main {
    public static void main(String[] args) {
        exception();
        //runTimeException();
    }

    private static void runTimeException() {
        ExemploThrow.saqueRuntimeException(500);
    }

    private static void exception() {
        try {
            ExemploThrow.saque(300);
        }catch (LimiteSaqueException e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
