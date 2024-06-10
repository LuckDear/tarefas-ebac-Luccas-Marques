package anotacao.exception;

public class TipoExceptionNaoEncontrada extends Exception{

    public TipoExceptionNaoEncontrada(String msg){
        this(msg, null);
    }
    public TipoExceptionNaoEncontrada(String msg, Throwable e){
        super(msg, e);
    }

}
