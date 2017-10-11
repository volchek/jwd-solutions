package by.tc.task01.entity;

public class Oven extends Appliance{
	private static final long serialVersionUID = 1L;
	
	private int powerConsumption;
	private int capacity;
	private double weight;
	private double depth;
	private double height;
	private double width;

	public Oven() { }
	
	public Oven(int powerConsumption, double weight, int capacity, double depth, double height, double width){
		this.powerConsumption = powerConsumption;
		this.capacity = capacity;
		this.weight = weight;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
	
	public int getPowerConsumption(){
		return powerConsumption;
	}
	
	public void setPowerConsumption(int powerConsumption){
		this.powerConsumption = powerConsumption;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getDepth(){
		return depth;
	}
	
	public void setDepth(double depth){
		this.depth = depth;
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
		Oven otherObject = (Oven)obj;
		if (powerConsumption != otherObject.powerConsumption ||
				weight != otherObject.weight ||
				capacity != otherObject.capacity ||
				depth != otherObject.depth ||
				width != otherObject.width ||
				height != otherObject.height){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + capacity;
        result = prime * result + depth;
        result = prime * result + height;
        result = prime * result + weight;
        result = prime * result + width;
		return (int)result;
    }
	
	
	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"powerConsumption=" + powerConsumption + 
				", capacity=" + capacity +
				", weight=" + weight + 
				", depth=" + depth + 
				", height=" + height + 
				", width=" + width;
	}
	
	@Override
	public String getInfo(){
		return "Oven with" + 
				"\n\tpower consumption: " + powerConsumption + 
				"\n\tcapacity: " + capacity +
				"\n\tweight: " + weight + 
				"\n\tdepth: " + depth + 
				"\n\theight: " + height + 
				"\n\twidth: " + width;
	}

}
