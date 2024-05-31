public class ExemploGenericEntry<T> {
    private T data;

    public ExemploGenericEntry(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
