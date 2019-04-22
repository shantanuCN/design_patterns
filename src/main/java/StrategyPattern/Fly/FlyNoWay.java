package StrategyPattern.Fly;

public class FlyNoWay implements FlyBehaviour {
    public void fly(){
        System.out.println("I can not fly");
    }
}
