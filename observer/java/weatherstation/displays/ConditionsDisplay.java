package weatherstation.displays;

import weatherstation.WeatherData;
import weatherstation.interfaces.*;

public class ConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public ConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // Use instance reference to register as an observer
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " 
        + temperature + "。C | " + humidity + "% humidity");
    }

    // Use the following methods to register or unregister this display.
    // These methods could be moved to an abstract superclass for reuse.
    // For simplicity, they are implemented here directly.
    public void unregister() {
        if (this.weatherData == null){
            System.out.println("<< Not regitser yet >>");
        } else {
            weatherData.removeObserver(this);
            this.weatherData = null;
            System.out.println("<< Unregitser success >>");
        }
    }

    public void register(WeatherData weatherData) {
        if (this.weatherData == null){
            weatherData.registerObserver(this);
            System.out.println("<< Register success >>");
        } else {
            weatherData.registerObserver(this);
            System.out.println("<< Register success >>");
        }
    }
}
