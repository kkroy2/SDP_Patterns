package DecoratorPattern;

public class test {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println("Description: "+beverage.getDescription());
        System.out.println("Total Cost: "+beverage.cost());

        beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println("Description: "+beverage.getDescription());
        System.out.println("Total Cost: "+beverage.cost());

        beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);
        System.out.println("Description: "+beverage.getDescription());
        System.out.println("Total Cost: "+beverage.cost());
    }
}
