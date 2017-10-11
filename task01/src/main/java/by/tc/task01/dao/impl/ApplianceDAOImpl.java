package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.creator.Command;
import by.tc.task01.entity.creator.Creator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
	
	private static final String pathToDb = "src/main/resources/appliances_db.txt";
	private static final String typeDelimiter = " : ";
	private static final String fieldsDelimiter = "\\s*,\\s+";
	private static final String partsDelimiter = "=";
	
	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		Map<String, Object> res = readFile(criteria);
		if (isMapNull(res)){
			return null;			
		}

		Creator objectCreator = new Creator();
		Command command = objectCreator.getCommand(criteria.getApplianceType());
		Appliance object = command.execute(res);
		
		return object;
	}
	
	private <E> Map<String, Object> readFile(Criteria<E> criteria){
		String pattern = criteria.getApplianceType();
		final String path = Paths.get(System.getProperty("user.dir"), pathToDb).toString();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	HashMap<String, Object> deviceInfo = splitLine(line, pattern);
		    	if (!isMapNull(deviceInfo)){
		    		if (checkDevice(deviceInfo, criteria)){
		    			return deviceInfo;
		    		}
		    	}
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	private HashMap<String, Object> splitLine(String line, String type){
		HashMap<String, Object> applianceInfo = new HashMap<String, Object>();
		String[] parts = line.split(typeDelimiter);
		if (!parts[0].equals(type)){
			return applianceInfo;
		}
		
		if (parts[1] != null && parts[1].length() > 0 && parts[1].charAt(parts[1].length() - 1) == ';') {
			parts[1] = parts[1].substring(0, parts[1].length() - 1);
	    }
		for(String keyValue : parts[1].split(fieldsDelimiter)) {
			String[] pairs = keyValue.split(partsDelimiter);
			applianceInfo.put(pairs[0], pairs[1]);
		}
		return applianceInfo;
	}
	
	private <E> boolean checkDevice(HashMap<String, Object> realProperties, Criteria<E> criteria){
		if (realProperties.isEmpty() || criteria.getCriteria().isEmpty() ){
			return false;
		}
		for (E name: criteria.getCriteria().keySet()){
            String key = name.toString();
            String value = criteria.getCriteria().get(name).toString();  
            if (!realProperties.get(key).equals(value)){
            	return false;
            }
		}
		return true;
	}
	
	private static boolean isMapNull(final Map<?, ?> m) {
	    return m == null || m.isEmpty();
	}

}

