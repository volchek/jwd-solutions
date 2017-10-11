package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;

public interface Command {
	public Appliance execute(Map<String, Object> properties);
}
