package abstractFactoryPattern;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutoMobile createCompactCar() {
		return new BMWM3();
	}

	@Override
	public IAutoMobile createSedanCar() {
		return new BMW740i(); 
	}

	@Override
	public IAutoMobile createScooterCar() {
		return new BMW328i();
	}	
	@Override
	public IAutoMobile createSportbikeCar() {
		return new BMW328i();
	}	
}