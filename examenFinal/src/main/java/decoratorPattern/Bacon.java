package decoratorPattern;


public class Bacon extends BreadDecorator {

    public Bacon(Bread bread) {
        super(bread);
        this.description = "Bacon";
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