package STRATEGY_DESIGN_PATTERN;

public class Player {
	
	IStrategy behaviour;
	String type;
	
	public Player(String type) {
		this.type = type;
	}

	public void setBehaviour(IStrategy behaviour) {
		this.behaviour = behaviour;
	}
	
	public void action() {
		System.out.println("Player : " + this.type);
		behaviour.actionCommand();
	}
	
	

}
