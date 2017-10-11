package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	private static final long serialVersionUID = 1L;
	
	private double powerConsumption;
	private double freezerCapacity;
	private double overallCapacity;
	private double weight;
	private double height;
	private double width;

	public Refrigerator() { }
	
	public Refrigerator(double powerConsumption, double freezerCapacity, double overallCapacity, double weight, double height, double width){
		this.powerConsumption = powerConsumption;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	public double getPowerConsumption(){
		return powerConsumption;
	}
	
	public void setPowerConsumption(double powerConsumption){
		this.powerConsumption = powerConsumption;
	}
	
	public double getFreezerCapacity(){
		return freezerCapacity;
	}
	
	public void setFreezerCapacity(double freezerCapacity){
		this.freezerCapacity = freezerCapacity;
	}
	
	public double getOverallCapacity(){
		return overallCapacity;
	}
	
	public void setOverallCapacity(double overallCapacity){
		this.overallCapacity = overallCapacity;
	}
	

	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidht(double width){
		this.width = width;
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
		Refrigerator otherObject = (Refrigerator)obj;
		if (powerConsumption != otherObject.powerConsumption ||
				weight != otherObject.weight ||
				freezerCapacity != otherObject.freezerCapacity ||
				overallCapacity != otherObject.overallCapacity ||
				height != otherObject.height ||
				width != otherObject.width){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + weight;
        result = prime * result + freezerCapacity;
        result = prime * result + overallCapacity;
        result = prime * result + height;
        result = prime * result + width;
		return (int)result;
	}

	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"powerConsumption=" + powerConsumption + 
				", freezerCapacity=" + freezerCapacity +
				", overallCapacity=" + overallCapacity + 
				", weight=" + weight +  
				", height=" + height + 
				", width=" + width;
	}	
	
	@Override
	public String getInfo(){
		return "Refigerator with" + 
		"\n\tpower consumption: " + powerConsumption + 
		"\n\tfreezer capacity: " + freezerCapacity +
		"\n\toverlall capacity: " + overallCapacity +
		"\n\tweight: " + weight + 
		"\n\theight: " + height + 
		"\n\twidth: " + width;
	}


}
