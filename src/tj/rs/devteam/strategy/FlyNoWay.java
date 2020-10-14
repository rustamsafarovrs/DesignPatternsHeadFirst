package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // Пустая реализация
//        System.out.println("FlyNoWay fly()");
        System.out.println("I can't fly");
    }
}
