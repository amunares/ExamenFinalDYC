package decoratorPattern;

public class BreadDecorator extends Bread {

    protected Bread bread;

    public BreadDecorator(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.description;
    }

    @Override
    public double calculateCost() {
        return bread.calculateCost();
    }
}