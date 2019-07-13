package decoratorPattern;


public class Turkey extends BreadDecorator {

    public Turkey(Bread bread) {
        super(bread);
        this.description = "Turkey";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", bread.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.bread.calculateCost() + 1.25;
    }
}