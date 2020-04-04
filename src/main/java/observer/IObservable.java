package observer;

public interface IObservable<E> {
    void subscribe(IObserver newObserver);
    void unsubscribe(IObserver observer);
    void notifyObservers(E event);
}
