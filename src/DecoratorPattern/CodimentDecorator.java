package DecoratorPattern;

public abstract class CodimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
