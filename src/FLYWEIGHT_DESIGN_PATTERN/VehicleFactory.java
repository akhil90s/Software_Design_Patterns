package FLYWEIGHT_DESIGN_PATTERN;

import java.util.HashMap;

public class VehicleFactory {
	
	private static HashMap<String, Vehicle> hashMap = new HashMap<>();
	
	public static Vehicle getVehicle(String type) {
		Vehicle vehicle = null;
		if(hashMap.containsKey(type)) {
			vehicle = hashMap.get(type);
		}else {
			switch (type) {
			case "Cycle":
				System.out.println("Cycle is created");
				vehicle = new Cycle();
				break;
			case "Truck":
				System.out.println("Truck is created");
				vehicle = new Truck();
				break;
			default:
				throw new IllegalStateException("Vehicle type " + type + "does not exist");
			}
			hashMap.put(type, vehicle);
		}
		return vehicle;
	}

}
