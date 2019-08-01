package Adapter_Design_Pattern;

public class ERPToolsAdapter implements Technology {

	
	private ERPTools ERPTools;
	
	public ERPToolsAdapter(Adapter_Design_Pattern.ERPTools eRPTools) {
		super();
		ERPTools = eRPTools;
	}

	@Override
	public void backendTechnolgy() {
		ERPTools.dataWareHouse();
	}

	@Override
	public void frontendTechnology() {
		ERPTools.middleWare();
	}

}
