package by.tc.task01.entity;

public class Speakers extends Appliance{
	private static final long serialVersionUID = 1L;
	
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private double cordLength;

	public Speakers() { }
	
	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength){
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}
	
	public int getPowerConsumption(){
		return powerConsumption;
	}
	
	public void setPowerConsumption(int powerConsumption){
		this.powerConsumption = powerConsumption;
	}
	
	public int getNumberOfSpeakers(){
		return numberOfSpeakers;
	}
	
	public void setNumberOfSpeakers(int numberOfSpeakers){
		this.numberOfSpeakers = numberOfSpeakers;
	}
	
	public String getFrequencyRange(){
		return frequencyRange;
	}
	
	public void setFrequencyRange(String frequencyRange){
		this.frequencyRange = frequencyRange;
	}
	
	public double getCordLength(){
		return cordLength;
	}
	
	public void setCordLength(double cordLength){
		this.cordLength = cordLength;
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
		Speakers otherObject = (Speakers)obj;
		if (powerConsumption != otherObject.powerConsumption ||
				numberOfSpeakers != otherObject.numberOfSpeakers ||
				cordLength != otherObject.cordLength){
			return false;
		}
		
		if (frequencyRange == null){
			if (otherObject.frequencyRange != null){
				return false;
			}
		}
		else if (!frequencyRange.equals(otherObject.frequencyRange)){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + numberOfSpeakers;
        result = prime * result + cordLength;
        result = prime * result + ((null == frequencyRange) ? 0 : frequencyRange.hashCode());
		return (int)result;
    }
	
	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"powerConsumption=" + powerConsumption + 
				", numberOfSpeakers=" + numberOfSpeakers +
				", frequencyRange=" + frequencyRange + 
				", cordLength=" + cordLength;
	}	

	@Override
	public String getInfo(){
		return "Speakers with" + 
		"\n\tpower consumption: " + powerConsumption + 
		"\n\tnumber of speakers: " + numberOfSpeakers +
		"\n\tfrequency range: " + frequencyRange + 
		"\n\tcord length: " + cordLength;
	}

	
}
