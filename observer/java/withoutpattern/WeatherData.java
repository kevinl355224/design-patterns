package withoutpattern;

public class WeatherData {
    // Direct references to display classes (tightly coupled)
    private CurrentConditionsDisplay currentConditionsDisplay;
    private CurrentPressureDisplay currentPressureDisplay;


    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        // Instantiate the display elements directly
        currentConditionsDisplay = new CurrentConditionsDisplay();
        currentPressureDisplay = new CurrentPressureDisplay();
    }

    public void measurementsChanged() {
        // Directly push data to each display
        currentConditionsDisplay.update(temp, humidity, pressure);
        currentPressureDisplay.update(temp, humidity, pressure);
    }

    // Use this function to simulate get a new data
    public void setMeasurements (float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
