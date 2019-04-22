import StrategyPattern.Ducks.Duck;
import StrategyPattern.Ducks.MallardDuck;
import StrategyPattern.Fly.FlyBehaviour;
import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quacks.Quack;
import StrategyPattern.Quacks.QuackBehaviour;

public class Driver {
    private static void driveStrategyPattern(){
        Duck mallardDuck = new MallardDuck();
        FlyBehaviour flyBehaviour = new FlyWithWings();
        QuackBehaviour quackBehaviour = new Quack();
        mallardDuck.setFlyBehaviour(flyBehaviour);
        mallardDuck.setQuackBehaviour(quackBehaviour);
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
        flyBehaviour = new FlyNoWay();
        // Changing behaviour on the fly
        mallardDuck.setFlyBehaviour(flyBehaviour);
        mallardDuck.performFly();
    }

    public static void main(String args[]) {
        driveStrategyPattern();
    }
}
