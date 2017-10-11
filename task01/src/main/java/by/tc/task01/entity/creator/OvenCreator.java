package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

public class OvenCreator implements Command {
	
	@Override
	public Appliance execute(Map<String, Object> properties) {
		Oven object = new Oven();
		object.setPowerConsumption(Integer.parseInt(properties.get(SearchCriteria.Oven.POWER_CONSUMPTION.name()).toString()));
		object.setWeight(Double.parseDouble(properties.get(SearchCriteria.Oven.WEIGHT.name()).toString()));
		object.setCapacity(Integer.parseInt(properties.get(SearchCriteria.Oven.CAPACITY.name()).toString()));
		object.setDepth(Double.parseDouble(properties.get(SearchCriteria.Oven.DEPTH.name()).toString()));
		object.setHeight(Double.parseDouble(properties.get(SearchCriteria.Oven.HEIGHT.name()).toString()));
		object.setWidht(Double.parseDouble(properties.get(SearchCriteria.Oven.WIDTH.name()).toString()));
		return object;
	}
	
}


