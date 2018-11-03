package ObserverPattern;

import java.util.*;

public class WeatherData implements Subject {
    ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0)
        {
            observers.remove(index);
        }
        return;
    }

    @Override
    public void notifyAllObserver() {

        for (Observer observer: observers)
        {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged()
    {
        notifyAllObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
