package StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        Duck duck1 = new RubberDuck();
        Duck duck2 = new DecoyDuck();
        duck.perfomFly();
        duck1.perfomFly();
        duck2.perfomFly();
        duck.performQuack();
        duck1.performQuack();
        duck2.performQuack();
        duck.display();
        duck1.display();
        duck2.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.perfomFly();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.perfomFly();
    }
}
