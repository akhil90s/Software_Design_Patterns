package BRIDGE_DESIGN_PATTERN;

public class Taxi extends Automobile {

	public Taxi(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Taxi is ");
		w1.work();
		w2.work();		
	}
	
	
	
}
