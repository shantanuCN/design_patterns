package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyBehaviour;
import StrategyPattern.Quacks.QuackBehaviour;

public abstract class Duck {
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    /**
     * Helps defining quackbehaviour behaviour at the runtime
     * @param quackBehaviour
     */
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    /**
     * Common to all types of ducks
     */
    public void swim(){
        System.out.println("I can swim");
    }

    /**
     * Common to all types of ducks
     * We want all the ducks to incorparate their displays
     */
    public abstract void display();
}
