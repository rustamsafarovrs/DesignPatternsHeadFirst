package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public void setFlyBehavior(FlyBehavior fb){
        mFlyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        mQuackBehavior = qb;
    }

    void performQuack(){
        mQuackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();

    void performFly(){
        mFlyBehavior.fly();
    }
}
