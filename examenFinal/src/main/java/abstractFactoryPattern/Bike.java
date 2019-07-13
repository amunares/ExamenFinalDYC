package abstractFactoryPattern;


public class Bike implements IAutoMobile {

	private String name;
	
	public Bike()
    {
        this.name = "Bike";
    }
	
	public void addSportPackage()
    {
        name += " S";
    }

    public void addLuxuryPackage()
    {
        name += " with leather upholstery";
    }
	
	@Override
	public void turnOn() {
		System.out.println("The " + name  );
		
	}

	@Override
	public void turnOff() {
		System.out.println("The " + name + " is has turned off.");		
	}
}
