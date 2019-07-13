package decoratorPattern;

import java.text.DecimalFormat;

public class Client {

    public static void main(String[] args) {
        //Pizza largePizza = new LargePizza();
    	Bread smallBread = new SmallBreadSandwich();
    	smallBread = new Beef(smallBread);
        smallBread = new Egg(smallBread);
        smallBread = new Chicken(smallBread);
        smallBread = new Turkey(smallBread);
        smallBread = new Bacon(smallBread);

        System.out.println(smallBread.getDescription());
        System.out.println(round(smallBread.calculateCost()));
    }

    public static double round(double value) {
        DecimalFormat newFormat = new DecimalFormat("##,##");
        return Double.valueOf(newFormat.format(value));
    }
}
