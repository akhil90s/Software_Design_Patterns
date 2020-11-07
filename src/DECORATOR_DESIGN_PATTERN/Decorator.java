package DECORATOR_DESIGN_PATTERN;

public class Decorator implements Car {

	private Car car;

	public Decorator(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void info() {
		this.car.info();

	}

}
