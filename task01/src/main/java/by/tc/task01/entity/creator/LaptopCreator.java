package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;

public class LaptopCreator implements Command{

	@Override
	public Appliance execute(Map<String, Object> properties) {
		Laptop object = new Laptop();
		object.setBatteryCapacity(Double.parseDouble(properties.get(SearchCriteria.Laptop.BATTERY_CAPACITY.name()).toString()));
		object.setOs(properties.get(SearchCriteria.Laptop.OS.name()).toString());
		object.setMemoryRom(Integer.parseInt(properties.get(SearchCriteria.Laptop.MEMORY_ROM.name()).toString()));
		object.setSystemMemory(Integer.parseInt(properties.get(SearchCriteria.Laptop.SYSTEM_MEMORY.name()).toString()));
		object.setCpu(Double.parseDouble(properties.get(SearchCriteria.Laptop.CPU.name()).toString()));
		object.setDisplayInchs(Integer.parseInt(properties.get(SearchCriteria.Laptop.DISPLAY_INCHS.name()).toString()));
		
		return object;
	}
	
}
