package weatherstation;

import weatherstation.displays.CurrentConditionsDisplay;
import weatherstation.displays.CurrentPressureDisplay;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentPressureDisplay currentPressureDisplay = new CurrentPressureDisplay(weatherData);

        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(25, 65, 101325);
        System.out.println("\n---- Simulate unregister pressure ----");
        currentPressureDisplay.unregister();
        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(27, 23, 100315);
        
    }

}