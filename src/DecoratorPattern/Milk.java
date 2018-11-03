package DecoratorPattern;

public class Milk extends CodimentDecorator {

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 20 + beverage.cost();
    }
}
