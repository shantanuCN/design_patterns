package StrategyPattern.Quacks;

public class MuteQuack implements QuackBehaviour {
    public void quack(){
        System.out.println("I can quack in mute mode");
    }
}
