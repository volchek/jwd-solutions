package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		String applianceType = criteria.getApplianceType();

		Checker checker = new Checker(applianceType);
		return checker.check(criteria);
	}

}

class Checker {
	
	private String objectType;
	private Map<String, Map<String, String>> map = new HashMap<>();
	
	public Checker(String type){
		this.objectType = type;
		setDataFields();
	}

	void setDataFields(){
		map.put("Oven", CheckData.getOvenFields());
		map.put("Laptop", CheckData.getLaptopFields());
		map.put("Refrigerator", CheckData.getRefrigeratorFields());
		map.put("VacuumCleaner", CheckData.getVacuumCleanerFields());
		map.put("TabletPC", CheckData.getTabletPCFields());
		map.put("Speakers", CheckData.getSpeakersFields());
	}
	
	 <E> boolean check(Criteria<E> criteria){

		Map<String, String> currentType = map.get(objectType);
		for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
		    String key = entry.getKey().toString();
		    String value = entry.getValue().toString();
		    
		    String keyType = currentType.get(key);
		    if (keyType.equals("String") ){
		    	continue;
		    }
		    String currentPattern = CheckData.getTypeToRegexMap().get(keyType);
		    if (!value.matches(currentPattern)){
		    	return true;
		    }
		}
	    return true;
	}
		
}


class CheckData {
	private static Map<String, String> typeToRegexMap = new HashMap<String, String>(){{
		put("int", "[0-9]+");
		final String numberTemplate = "[0-9]+(\\.[0-9]+)?";		
		put("double", numberTemplate);
		put("range", numberTemplate + "-" + numberTemplate);
	}};

	private static final String
		intDescriptor = "int",
		doubleDescriptor = "double",
		rangeDescriptor = "range",
		stringDescriptor = "String";
	
	private static Map<String, String> ovenFields = new HashMap<String, String>(){{
		put(Oven.POWER_CONSUMPTION.name(), intDescriptor);
		put(Oven.CAPACITY.name(), intDescriptor);
		put(Oven.DEPTH.name(), doubleDescriptor);
		put(Oven.HEIGHT.name(), doubleDescriptor);
		put(Oven.WEIGHT.name(), doubleDescriptor);
		put(Oven.WIDTH.name(), doubleDescriptor);
	}};
	
	private static Map<String, String> laptopFields = new HashMap<String, String>(){{
		put(Laptop.BATTERY_CAPACITY.name(), doubleDescriptor);
		put(Laptop.OS.name(), stringDescriptor);
		put(Laptop.MEMORY_ROM.name(), intDescriptor);
		put(Laptop.SYSTEM_MEMORY.name(), intDescriptor);
		put(Laptop.CPU.name(), doubleDescriptor);
		put(Laptop.DISPLAY_INCHS.name(), intDescriptor);
	}};
	
	private static Map<String, String> refrigeratorFields = new HashMap<String, String>(){{
		put(Refrigerator.POWER_CONSUMPTION.name(), doubleDescriptor);
		put(Refrigerator.WEIGHT.name(), doubleDescriptor);
		put(Refrigerator.FREEZER_CAPACITY.name(), doubleDescriptor);
		put(Refrigerator.OVERALL_CAPACITY.name(), doubleDescriptor);
		put(Refrigerator.WIDTH.name(), doubleDescriptor);
		put(Refrigerator.HEIGHT.name(), doubleDescriptor);
	}};


	private static Map<String, String> speakersFields = new HashMap<String, String>(){{
		put(Speakers.POWER_CONSUMPTION.name(), intDescriptor);
		put(Speakers.NUMBER_OF_SPEAKERS.name(), intDescriptor);
		put(Speakers.CORD_LENGTH.name(), doubleDescriptor);
		put(Speakers.FREQUENCY_RANGE.name(), rangeDescriptor);
	}};

	private static Map<String, String> tabletPCFields = new HashMap<String, String>(){{
		put(TabletPC.BATTERY_CAPACITY.name(), doubleDescriptor);
		put(TabletPC.DISPLAY_INCHES.name(), intDescriptor);
		put(TabletPC.MEMORY_ROM.name(), intDescriptor);
		put(TabletPC.FLASH_MEMORY_CAPACITY.name(), intDescriptor);
		put(TabletPC.COLOR.name(), stringDescriptor);
	}};
	
	private static Map<String, String> vacuumCleanerFields = new HashMap<String, String>(){{
		put(VacuumCleaner.POWER_CONSUMPTION.name(), intDescriptor);
		put(VacuumCleaner.MOTOR_SPEED_REGULATION.name(), intDescriptor);
		put(VacuumCleaner.CLEANING_WIDTH.name(), intDescriptor);
		put(VacuumCleaner.FILTER_TYPE.name(), stringDescriptor);
		put(VacuumCleaner.BAG_TYPE.name(), stringDescriptor);
		put(VacuumCleaner.WAND_TYPE.name(), stringDescriptor);
	}};
	
	static Map<String, String> getTypeToRegexMap(){
		return typeToRegexMap;
	}

	static Map<String, String> getOvenFields(){
		return ovenFields;
	}
	
	static Map<String, String> getLaptopFields(){
		return laptopFields;
	}
	
	static Map<String, String> getRefrigeratorFields(){
		return refrigeratorFields;
	}

	static Map<String, String> getVacuumCleanerFields(){
		return vacuumCleanerFields;
	}

	static Map<String, String> getTabletPCFields(){
		return tabletPCFields;
	}

	static Map<String, String> getSpeakersFields(){
		return speakersFields;
	}
}