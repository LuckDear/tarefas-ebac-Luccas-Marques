package anonimas;
@FunctionalInterface
public interface MyConsumerReturn<T> {
    public T consumer(T value);
}
