package BRIDGE_DESIGN_PATTERN;

public class Bus extends Automobile {

	public Bus(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bus is ");
		w1.work();
		w2.work();		
	}
	
	
	
}
