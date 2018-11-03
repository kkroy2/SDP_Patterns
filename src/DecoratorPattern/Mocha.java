package DecoratorPattern;

public class Mocha extends CodimentDecorator {

    Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    @Override
    public double cost() {
        return 30 + beverage.cost();
    }
}
