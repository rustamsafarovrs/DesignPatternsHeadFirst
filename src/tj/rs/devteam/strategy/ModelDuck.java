package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I’m a model duck");
    }
}
