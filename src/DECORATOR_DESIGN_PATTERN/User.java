package DECORATOR_DESIGN_PATTERN;

public class User {

	public static void main(String[] args) {
		
		System.out.println("----- Basic Car -----");
		BasicCar basicCar = new BasicCar();
		basicCar.info();
		
		System.out.println("----- Passenger Car -----");
		PassengerCar passengerCar = new PassengerCar(basicCar);
		passengerCar.info();
		
		System.out.println("----- Luxury Passenger Car -----");
		LuxuryCar luxuryCar = new LuxuryCar(passengerCar);
		luxuryCar.info();
		
	}

}
