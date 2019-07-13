package abstractFactoryPattern;

public class ScooterFactory implements IAutoFactory {

	@Override
	public IAutoMobile createCompactCar() {
		Scooter mini = new Scooter();
        mini.addSportPackage();
        return mini;
	}

	@Override
	public IAutoMobile createSedanCar() {
		Scooter mini = new Scooter();        
        mini.addLuxuryPackage();        
        return mini;
	}

	@Override
	public IAutoMobile createScooterCar() {
		return new Scooter();
	}	
	@Override
	public IAutoMobile createSportbikeCar() {
		return new Scooter();
	}	
}