package ADAPTER_DESIGN_PATTERN_1;

public class BirdAdapter implements ToyDuck {

	Bird bird;

	public BirdAdapter(Bird bird) {
		super();
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
	}

}
