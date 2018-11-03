package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 303.0f;
    private float sumTemp = 0.0f;
    private int numberofReadings = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject subject)
    {
        this.weatherData = subject;
        weatherData.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/max/min Temperature = "+(sumTemp/numberofReadings)+"/"+maxTemp+"/"+minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemp += temperature;
        numberofReadings ++;
        maxTemp = Math.max(maxTemp , temperature);
        minTemp = Math.min(minTemp , temperature);
        display();
    }
}
