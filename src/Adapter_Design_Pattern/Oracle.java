package Adapter_Design_Pattern;

public class Oracle implements ERPTools {

	@Override
	public void middleWare() {
		System.out.println("In Oracle middleWare");
	}

	@Override
	public void dataWareHouse() {
		
		System.out.println("in Oracle MiddleWare");
	}

}
