package decoratorPattern;

public class SmallBreadSandwich extends Bread {

    public SmallBreadSandwich() {
        this.description = "Small Bread Sandwich";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateCost() {
        return 3.00;
    }
}