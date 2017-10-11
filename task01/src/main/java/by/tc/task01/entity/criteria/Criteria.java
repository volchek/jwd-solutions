package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	private String applianceType;	
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	public Map<E, Object> getCriteria(){
		return criteria;
	}
	
	public void setApplianceType(String type){
		this.applianceType = type;
	}
	
	public String getApplianceType(){
	   return this.applianceType;
	}
	
}
