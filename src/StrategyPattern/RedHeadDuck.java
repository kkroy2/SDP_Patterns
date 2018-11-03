package StrategyPattern;

public class RedHeadDuck extends Duck {

    public RedHeadDuck()
    {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck !!");
    }
}
