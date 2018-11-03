package DecoratorPattern;

public class HouseBlend extends Beverage {
    public HouseBlend()
    {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 120;
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
}
