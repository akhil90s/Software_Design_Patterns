package MEMENTO_DESIGN_PATTERN;


//https://www.youtube.com/watch?v=8hvvyJPNaBE&t=1055s
public class Main {

	public static void main(String[] args) {
		Orginator orginator = new Orginator();
		TheCareTaker careTaker = new TheCareTaker();
		
		orginator.setArticle("State 1");
		careTaker.addMemento(orginator.save());
		printState(orginator);
		
		orginator.setArticle("State 2");
		careTaker.addMemento(orginator.save());
		printState(orginator);
		
		orginator.restore(careTaker.undo());
		

	}
	
	public static void printState(Orginator orginator) {
		System.out.println("Current state : " + orginator.getArticle());
		
	}

}
