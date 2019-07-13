package abstractFactoryPattern;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		IAutoFactory factory = loadFactory();
		
       

		printHeader("COMPACT CAR");
		IAutoMobile car = factory.createCompactCar();
        car.turnOn();
        car.turnOff();
        
        printHeader("SEDAN CAR");
		car = factory.createSedanCar();
        car.turnOn();
        car.turnOff();
        
        printHeader("SCOOTER CAR");
		car = factory.createScooterCar();
        car.turnOn();
        car.turnOff();  

        printHeader("SPORTBIKE CAR");
		car = factory.createSportbikeCar();
        car.turnOn();
        car.turnOff();  
		
		
	}
	
	private static IAutoFactory loadFactory() throws Exception
    {
		IAutoFactory autoFactory = null;
		String factoryName = Util.getPropertyValue("config.properties", "DefaultAbstractFactory");
        try {
            autoFactory = (IAutoFactory) Class.forName(factoryName).newInstance();
        } catch( Exception ex) {        	
        }
        return autoFactory;
    }
	
	public static void printHeader(String title)
	{
		System.out.format("++++++++++++++++ %s ++++++++++++++++++\n", title);
	}
}