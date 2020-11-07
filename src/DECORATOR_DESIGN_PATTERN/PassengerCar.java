package DECORATOR_DESIGN_PATTERN;

public class PassengerCar extends Decorator{

	public PassengerCar(Car car) {
		super(car);
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(" Passenger Car Design ");
	}

	
	
}
