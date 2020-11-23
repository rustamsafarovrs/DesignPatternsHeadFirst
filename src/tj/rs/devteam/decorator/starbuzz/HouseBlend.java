package tj.rs.devteam.decorator.starbuzz;

/**
 * @author Rustam Safarov(RS)
 * created at 23.11.2020
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
