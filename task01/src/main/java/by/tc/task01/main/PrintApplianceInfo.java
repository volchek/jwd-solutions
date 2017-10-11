package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance != null){
			System.out.println("RESULT: " + appliance.getInfo());
		}
		else {
			System.out.println("The object was not found");
		}
	}
	
}
