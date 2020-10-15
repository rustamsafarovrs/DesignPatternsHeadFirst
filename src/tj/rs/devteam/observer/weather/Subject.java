package tj.rs.devteam.observer.weather;

/**
 * @author Rustam Safarov(RS)
 * created at 15.10.2020
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
