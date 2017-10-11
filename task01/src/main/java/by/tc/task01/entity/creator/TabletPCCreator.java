package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPCCreator implements Command {

	@Override
	public Appliance execute(Map<String, Object> properties) {
		TabletPC object = new TabletPC();
		object.setBatteryCapacity(Double.parseDouble(properties.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.name()).toString()));
		object.setDisplayInchs(Integer.parseInt(properties.get(SearchCriteria.TabletPC.DISPLAY_INCHES.name()).toString()));
		object.setMemoryRom(Integer.parseInt(properties.get(SearchCriteria.TabletPC.MEMORY_ROM.name()).toString()));
		object.setFlashMemoryCapacity(Integer.parseInt(properties.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name()).toString()));
		object.setColor(properties.get(SearchCriteria.TabletPC.COLOR.name()).toString());
		
		return object;
	}

}
