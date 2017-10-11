package by.tc.task01.entity;

public class Laptop extends Appliance{
	private static final long serialVersionUID = 1L;
	
	private double batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private int displayInchs;

	public Laptop() { }
	
	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs){
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}
	
	public double getBatteryCapacity(){
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(double batteryCapacity){
		this.batteryCapacity = batteryCapacity;
	}
	
	public String getOs(){
		return os;
	}
	
	public void setOs(String os){
		this.os = os;
	}
	
	public int getMemoryRom(){
		return memoryRom;
	}
	
	public void setMemoryRom(int memoryRom){
		this.memoryRom = memoryRom;
	}
	
	public int getSystemMemory(){
		return systemMemory;
	}
	
	public void setSystemMemory(int systemMemory){
		this.systemMemory = systemMemory;
	}
	
	public double getCpu(){
		return cpu;
	}
	
	public void setCpu(double cpu){
		this.cpu = cpu;
	}
	
	public int getDisplayInchs(){
		return displayInchs;
	}
	
	public void setDisplayInchs(int displayInchs){
		this.displayInchs = displayInchs;
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
		Laptop otherObject = (Laptop)obj;
		if (batteryCapacity != otherObject.batteryCapacity ||
				memoryRom != otherObject.memoryRom ||
				systemMemory != otherObject.systemMemory ||
				displayInchs != otherObject.displayInchs ||
				cpu != otherObject.cpu){
			return false;
		}
		if (os == null){
			if (otherObject.os != null){
				return false;
			}
		}
		else if (!os.equals(otherObject.os)){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
        result = prime * result + batteryCapacity;
        result = prime * result + cpu;
        result = prime * result + displayInchs;
        result = prime * result + memoryRom;
        result = prime * result + systemMemory;
        result = prime * result + ((null == os) ? 0 : os.hashCode());
		return (int)result;
    }
	
	@Override
	public String toString(){
		return getClass().getName() + "@" +
				"batteryCapacity=" + batteryCapacity + 
				", os=" + os +
				", memoryROM=" + memoryRom + 
				", systemMemory=" + systemMemory + 
				", cpu=" + cpu +
				", displayInchs=" + displayInchs;
	}	
	
	@Override
	public String getInfo(){
		return "Laptop with" + 
		"\n\tbattery capacity: " + batteryCapacity + 
		"\n\tOS: " + os +
		"\n\tmemory ROM: " + memoryRom + 
		"\n\tsystem memory: " + systemMemory + 
		"\n\tCPU: " + cpu +
		"\n\tdisplay inchs: " + displayInchs;		
	}

}
