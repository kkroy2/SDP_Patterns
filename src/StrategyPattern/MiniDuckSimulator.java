package StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        Duck duck1 = new RubberDuck();
        Duck duck2 = new DecoyDuck();
        duck.performFly();
        duck1.performFly();
        duck2.performFly();
        duck.performQuack();
        duck1.performQuack();
        duck2.performQuack();
        duck.display();
        duck1.display();
        duck2.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.performFly();
    }
}
