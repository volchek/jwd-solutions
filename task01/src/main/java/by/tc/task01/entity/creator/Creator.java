package by.tc.task01.entity.creator;

import java.util.HashMap;
import java.util.Map;

public class Creator{
    private Map<String, Command> map = new HashMap<>();

    public Creator(){
    	map.put("Oven", new OvenCreator());
    	map.put("Laptop", new LaptopCreator());
    	map.put("TabletPC", new TabletPCCreator());
    	map.put("Speakers", new SpeakersCreator());
    	map.put("Refrigerator", new RefrigeratorCreator());
    	map.put("VacuumCleaner", new VacuumCleanerCreator());    	
    }

    public Command getCommand(String typeName){
        Command command;
        command = map.get(typeName);
        return command;
    }

}
