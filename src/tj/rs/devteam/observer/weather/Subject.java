package tj.rs.devteam.observer.weather;

/**
 * @author Rustam Safarov(RS)
 * created at 15.10.2020
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
