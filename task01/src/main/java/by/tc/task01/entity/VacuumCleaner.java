package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
	private static final long serialVersionUID = 1L;
	
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner() { }
	
	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth){
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}
	
	public int getPowerConsumption(){
		return powerConsumption;
	}
	
	public void setPowerConsumption(int powerConsumption){
		this.powerConsumption = powerConsumption;
	}
	
	public String getFilterType(){
		return filterType;
	}
	
	public void setFilterType(String filterType){
		this.filterType = filterType;
	}

	public String getBagType(){
		return bagType;
	}
	
	public void setBagType(String bagType){
		this.bagType = bagType;
	}

	public String getWandType(){
		return wandType;
	}
	
	public void setWandType(String wandType){
		this.wandType = wandType;
	}
	
	public int getMotorSpeedRegulation(){
		return motorSpeedRegulation;
	}
	
	public void setMotorSpeedRegulation(int motorSpeedRegulation){
		this.motorSpeedRegulation = motorSpeedRegulation;
	}
	
	public int getCleaningWidth(){
		return cleaningWidth;
	}
	
	public void setCleaningWidth(int cleaningWidth){
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VacuumCleaner otherObject = (VacuumCleaner)obj;
		if (powerConsumption != otherObject.powerConsumption ||
				motorSpeedRegulation != otherObject.motorSpeedRegulation ||
				cleaningWidth != otherObject.cleaningWidth){
			return false;
		}
		
		if (filterType == null){
			if (otherObject.filterType != null){
				return false;
			}
		}
		else if (!filterType.equals(otherObject.filterType)){
			return false;
		}
		
		if (bagType == null){
			if (otherObject.bagType != null){
				return false;
			}
		}
		else if (!bagType.equals(otherObject.bagType)){
			return false;
		}
		
		if (wandType == null){
			if (otherObject.wandType != null){
				return false;
			}
		}
		else if (!wandType.equals(otherObject.wandType)){
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + ((null == filterType) ? 0 : filterType.hashCode());        
        result = prime * result + ((null == bagType) ? 0 : bagType.hashCode());
        result = prime * result + ((null == wandType) ? 0 : wandType.hashCode());
        result = prime * result + motorSpeedRegulation;
        result = prime * result + cleaningWidth;
		return (int)result;
    }
	
	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"Power Consumption=" + powerConsumption + 
				", filterType=" + filterType +
				", bagType=" + bagType + ", wandType=" + wandType + 
				", motorSpeedRegulation=" + motorSpeedRegulation + 
				", cleaningWidth=" + cleaningWidth;
	}
	
	@Override
	public String getInfo(){
		return "Vacuum Cleaner with" + 
				"\n\tpower consumption: " + powerConsumption + 
				"\n\tfilter type: " + filterType +
				"\n\tbag type: " + bagType + 
				"\n\twand type: " + wandType + 
				"\n\tmotor speed regulation: " + motorSpeedRegulation + 
				"\n\tcleaning width: " + cleaningWidth;
	}

}
