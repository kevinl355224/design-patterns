package withoutpattern;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(25, 65, 101325);
        System.out.println("\n---- Simulate data update ----");
        weatherData.setMeasurements(27, 23, 100315);
        
    }

}