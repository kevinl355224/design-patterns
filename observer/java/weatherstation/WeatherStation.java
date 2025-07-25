package weatherstation;

import weatherstation.displays.ConditionsDisplay;
import weatherstation.displays.PressureDisplay;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(25, 65, 101325);
        System.out.println("\n---- Simulate unregister pressure ----");
        pressureDisplay.unregister();
        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(27, 23, 100315);
        
    }

}