package DecoratorPattern;

public abstract class Beverage  {
    String description = "Unknown";
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
        return;
    }
    public abstract double cost();

}
