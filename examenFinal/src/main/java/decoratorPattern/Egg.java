package decoratorPattern;

public class Egg extends BreadDecorator {

    public Egg(Bread bread) {
        super(bread);
        this.description = "Egg";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", bread.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.bread.calculateCost() + 1.00;
    }
}