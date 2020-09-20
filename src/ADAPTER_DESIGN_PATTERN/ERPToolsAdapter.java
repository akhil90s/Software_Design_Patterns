package ADAPTER_DESIGN_PATTERN;

public class ERPToolsAdapter implements Technology {

	
	private ERPTools ERPTools;
	
	public ERPToolsAdapter(ADAPTER_DESIGN_PATTERN.ERPTools eRPTools) {
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
