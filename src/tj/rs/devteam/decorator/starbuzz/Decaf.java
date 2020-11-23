package tj.rs.devteam.decorator.starbuzz;

/**
 * @author Rustam Safarov(RS)
 * created at 23.11.2020
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
