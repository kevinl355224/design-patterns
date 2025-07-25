package withoutpattern;

public class CurrentConditionsDisplay {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current Conditions: " + temp + "。C, " + humidity + "%, " + pressure + " Pa");
    }
}
