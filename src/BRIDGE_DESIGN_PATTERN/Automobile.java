package BRIDGE_DESIGN_PATTERN;

public abstract class Automobile {

	protected Workshop w1;
	protected Workshop w2;

	public Automobile(Workshop workshop1, Workshop workshop2) {
		super();
		this.w1 = workshop1;
		this.w2 = workshop2;
	}
	
	public abstract void manufacture();

}
