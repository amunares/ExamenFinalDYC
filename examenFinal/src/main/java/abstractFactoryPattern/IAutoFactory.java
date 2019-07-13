package abstractFactoryPattern;

public interface IAutoFactory {
	IAutoMobile createCompactCar();
	IAutoMobile createSedanCar();
	IAutoMobile createScooterCar();
	IAutoMobile createSportbikeCar();

}