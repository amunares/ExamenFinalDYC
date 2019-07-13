package decoratorPattern;

public class LargeBreadSandwich extends Bread {

    public LargeBreadSandwich() {
        this.description = "Large Bread Sandwich";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateCost() {
        return 9.00;
    }
}