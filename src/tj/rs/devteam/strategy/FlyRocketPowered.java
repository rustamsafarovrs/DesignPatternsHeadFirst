package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
