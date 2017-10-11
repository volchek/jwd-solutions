package by.tc.task01.entity.creator;

import java.util.Map;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;


public class SpeakersCreator implements Command {

	@Override
	public Appliance execute(Map<String, Object> properties) {
		Speakers object = new Speakers();
		object.setPowerConsumption(Integer.parseInt(properties.get(SearchCriteria.Speakers.POWER_CONSUMPTION.name()).toString()));
		object.setNumberOfSpeakers(Integer.parseInt(properties.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name()).toString()));
		object.setFrequencyRange(properties.get(SearchCriteria.Speakers.FREQUENCY_RANGE.name()).toString());
		object.setCordLength(Double.parseDouble(properties.get(SearchCriteria.Speakers.CORD_LENGTH.name()).toString()));
		
		return object;
	}

}
