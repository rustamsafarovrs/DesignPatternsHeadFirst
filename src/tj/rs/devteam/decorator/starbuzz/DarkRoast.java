package tj.rs.devteam.decorator.starbuzz;

/**
 * @author Rustam Safarov(RS)
 * created at 23.11.2020
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
