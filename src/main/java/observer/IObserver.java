package observer;

public interface IObserver<E> {
    void  update(E event);
}
