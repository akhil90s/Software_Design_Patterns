package STRATEGY_DESIGN_PATTERN_1;

public class StrategyDemo {

	
	
	// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
	public static void main(String[] args) {
		
		StrategyContext sc1 = new StrategyContext(new OperationAdd());
		int result = sc1.doExecute(3, 5);
		System.out.println(result);
		
	}

}
