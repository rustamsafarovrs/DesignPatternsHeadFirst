package tj.rs.devteam.strategy;

/**
 * @author Rustam Safarov(RS)
 * created at 14.10.2020
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // Пустая релазация
//        System.out.println("MuteQuack quack");
        System.out.println("<< Silence >>");
    }
}
