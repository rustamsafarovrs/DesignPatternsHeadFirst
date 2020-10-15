package tj.rs.devteam.observer.weather;

/**
 * @author Rustam Safarov(RS)
 * created at 15.10.2020
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
