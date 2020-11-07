package STRATEGY_DESIGN_PATTERN;

public class UserPlayer {

	public static void main(String[] args) {
		
		Player terrorist = new Player("Terrorist");
		Player counterTerrorist = new Player("Counter Terrorist");
		
		System.out.println("Before the bomb is planted");
		terrorist.setBehaviour(new AggresiveStrategy());
		counterTerrorist.setBehaviour(new DefensiveStrategy());
		
		terrorist.action();
		counterTerrorist.action();
		
		System.out.println();
		
		System.out.println("After the bomb is planted");
		terrorist.setBehaviour(new DefensiveStrategy());
		counterTerrorist.setBehaviour(new AggresiveStrategy());
		
		terrorist.action();
		counterTerrorist.action();
		
		
	}

}
