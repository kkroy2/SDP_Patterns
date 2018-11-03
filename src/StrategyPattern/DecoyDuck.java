package StrategyPattern;

public class DecoyDuck extends Duck {
    public DecoyDuck()
    {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck !!");
    }

}
