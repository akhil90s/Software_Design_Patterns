package TEMPLATE_DESIGN_PATTERN;

public class Buyer {
	
	public static void main(String[] args) {
		ComputerTemplate laptop = new Laptop();
		laptop.buildComputer();
		
		ComputerTemplate server = new Server();
		server.buildComputer();
	}

}
