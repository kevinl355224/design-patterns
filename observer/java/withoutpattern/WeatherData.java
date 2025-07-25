package withoutpattern;

public class WeatherData {
    // Direct references to display classes (tightly coupled)
    private ConditionsDisplay conditionsDisplay;
    private PressureDisplay pressureDisplay;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        // Instantiate the display elements directly
        conditionsDisplay = new ConditionsDisplay();
        pressureDisplay = new PressureDisplay();
    }

    public void measurementsChanged() {
        // Directly push data to each display
        conditionsDisplay.update(temp, humidity, pressure);
        pressureDisplay.update(temp, humidity, pressure);
    }

    // Use this function to simulate get a new data
    public void setMeasurements (float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
