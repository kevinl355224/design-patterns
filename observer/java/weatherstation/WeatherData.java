package weatherstation;
import weatherstation.interfaces.Observer;
import weatherstation.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    // Use a list to store the observers that have registered.
    private List<Observer> observers;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
          observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
          observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    // Use this function to simulate get a new data
    public void setMeasurements (float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
    }
}
