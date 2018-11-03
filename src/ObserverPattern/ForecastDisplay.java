package ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement{
   private float currentPressure = 30.30f;
   private float lastPressure ;
   private Subject weatherdata;

   public ForecastDisplay(Subject subject)
   {
       this.weatherdata = subject;
       weatherdata.addObserver(this);
   }


    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
