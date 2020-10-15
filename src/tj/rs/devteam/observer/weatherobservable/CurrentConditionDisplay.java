package tj.rs.devteam.observer.weatherobservable;

import javafx.beans.binding.When;
import tj.rs.devteam.observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Rustam Safarov(RS)
 * created at 15.10.2020
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable mObservable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.mObservable = observable;
        mObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
