package FLYWEIGHT_DESIGN_PATTERN;

public class User {

	public static void main(String[] args) {
		Vehicle cycle = VehicleFactory.getVehicle("Cycle");
		cycle.assignColour("Blue");
		cycle.startEngine();	
		
		Vehicle truck = VehicleFactory.getVehicle("Truck");
		truck.assignColour("Blue");
		truck.startEngine();		
	}

}
