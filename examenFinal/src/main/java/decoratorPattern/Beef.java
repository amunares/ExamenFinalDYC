package decoratorPattern;

public class Beef extends BreadDecorator {

    public Beef(Bread bread) {
        super(bread);
        this.description = "Beef";
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