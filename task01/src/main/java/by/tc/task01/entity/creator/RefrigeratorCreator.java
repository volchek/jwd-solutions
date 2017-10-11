package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

public class RefrigeratorCreator implements Command {

	@Override
	public Appliance execute(Map<String, Object> properties) {
		Refrigerator object = new Refrigerator();
		object.setPowerConsumption(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name()).toString()));
		object.setWeight(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.WEIGHT.name()).toString()));
		object.setFreezerCapacity(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name()).toString()));
		object.setOverallCapacity(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name()).toString()));
		object.setHeight(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.HEIGHT.name()).toString()));
		object.setWidht(Double.parseDouble(properties.get(SearchCriteria.Refrigerator.WIDTH.name()).toString()));
		
		return object;
	}

}
