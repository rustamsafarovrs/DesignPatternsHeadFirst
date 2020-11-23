package tj.rs.devteam.decorator.starbuzz;

/**
 * @author Rustam Safarov(RS)
 * created at 23.11.2020
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
