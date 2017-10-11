package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;


public class VacuumCleanerCreator implements Command {

	@Override
	public Appliance execute(Map<String, Object> properties) {
		VacuumCleaner object = new VacuumCleaner();
		object.setPowerConsumption(Integer.parseInt(properties.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name()).toString()));
		object.setFilterType(properties.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.name()).toString());
		object.setBagType(properties.get(SearchCriteria.VacuumCleaner.BAG_TYPE.name()).toString());
		object.setWandType(properties.get(SearchCriteria.VacuumCleaner.WAND_TYPE.name()).toString());
		object.setMotorSpeedRegulation(Integer.parseInt(properties.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name()).toString()));
		object.setCleaningWidth(Integer.parseInt(properties.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name()).toString()));
		
		return object;
	}

}
