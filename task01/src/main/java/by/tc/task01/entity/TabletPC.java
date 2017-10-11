package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private static final long serialVersionUID = 1L;
	
	private double batteryCapacity;
	private int displayInchs;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public TabletPC() { }
	
	public TabletPC(double batteryCapacity, int displayInchs, int memoryRom, int flashMemoryCapacity, String color){
		this.batteryCapacity = batteryCapacity;
		this.displayInchs = displayInchs;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}
	
	public double getBatteryCapacity(){
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(double batteryCapacity){
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getDisplayInchs(){
		return displayInchs;
	}
	
	public void setDisplayInchs(int displayInchs){
		this.displayInchs = displayInchs;
	}

	public int getMemoryRom(){
		return memoryRom;
	}
	
	public void setMemoryRom(int memoryRom){
		this.memoryRom = memoryRom;
	}
	
	public int getFlashMemoryCapacity(){
		return flashMemoryCapacity;
	}
	
	public void setFlashMemoryCapacity(int flashMemoryCapacity){
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
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
		TabletPC otherObject = (TabletPC)obj;
		if (batteryCapacity != otherObject.batteryCapacity ||
				memoryRom != otherObject.memoryRom ||
				flashMemoryCapacity != otherObject.flashMemoryCapacity ||
				displayInchs != otherObject.displayInchs){
			return false;
		}
		if (color == null){
			if (otherObject.color != null){
				return false;
			}
		}
		else if (!color.equals(otherObject.color)){
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + batteryCapacity;
        result = prime * result + displayInchs;
        result = prime * result + memoryRom;
        result = prime * result + flashMemoryCapacity;
        result = prime * result + ((null == color) ? 0 : color.hashCode());
		return (int)result;
    }
	
	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"batteryCapacity=" + batteryCapacity + 
				", displayInchs=" + displayInchs +
				", memoryROM=" + memoryRom + 
				", flashMemoryCapacity=" + flashMemoryCapacity + 
				", color=" + color;
	}	
	
	@Override
	public String getInfo(){
		return "TabletPC with" + 
				"\n\tbattery capacity: " + batteryCapacity + 
				"\n\tdisplay inchs: " + displayInchs +
				"\n\tmemory ROM: " + memoryRom + 
				"\n\tflash memory capacity: " + flashMemoryCapacity + 
				"\n\tcolor: " + color;
	}


}
