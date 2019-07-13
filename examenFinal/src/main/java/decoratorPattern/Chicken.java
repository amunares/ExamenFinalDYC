package decoratorPattern;

public class Chicken extends BreadDecorator {

    public Chicken(Bread bread) {
        super(bread);
        this.description = "Chicken";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", bread.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.bread.calculateCost() + 2.00;
    }
}