package ADAPTER_DESIGN_PATTERN_1;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("Sparrow Is Flying");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Sparrow Is Making Sounds");
	}

}
