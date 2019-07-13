package abstractFactoryPattern;

public class Scooter implements IAutoMobile {

	private String name;
	
	public Scooter()
    {
        this.name = "Scooter";
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
		System.out.println("The " + name );
		
	}

	@Override
	public void turnOff() {
		System.out.println("The " + name + " is has turned off.");		
	}
}