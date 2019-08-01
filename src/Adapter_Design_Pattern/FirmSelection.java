package Adapter_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class FirmSelection {

	List<Technology> resultList = new ArrayList<>();

	public void addTechFirms(Technology technology) {
		resultList.add(technology);
	}

	public List<Technology> getTechnologyFirms() {
		return new ArrayList<Technology>(resultList);

	}

}
