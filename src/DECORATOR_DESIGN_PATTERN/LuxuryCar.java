package DECORATOR_DESIGN_PATTERN;

public class LuxuryCar extends Decorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(" Luxury Car Design ");
	}
}
