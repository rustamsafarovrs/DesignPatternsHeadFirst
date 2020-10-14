package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // Кряканье
//        System.out.println("Quack quack()");
        System.out.println("Quack");
    }
}
