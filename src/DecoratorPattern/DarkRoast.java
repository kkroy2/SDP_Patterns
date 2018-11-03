package DecoratorPattern;

public class DarkRoast extends Beverage {

    DarkRoast()
    {
        description = "DarkRoast Coffee";
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public double cost() {
        return 110;
    }
}
