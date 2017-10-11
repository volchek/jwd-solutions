package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {
	
	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 3);
		criteriaOven.setApplianceType("Oven");

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.DEPTH, 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////

				
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setApplianceType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 4);
		
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////
		
		criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setApplianceType("TabletPC");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, 2);
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////
		
		Criteria<Laptop> criteriaLaptop = new Criteria<Laptop>();
		criteriaLaptop.setApplianceType("Laptop");
		criteriaLaptop.add(Laptop.OS, "Linux");
		
		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");

		//////////////////////////////////////////////////////////////////
		
		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>();
		criteriaVacuumCleaner.setApplianceType("VacuumCleaner");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "AA-89");
		
		appliance = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<Refrigerator>();
		criteriaRefrigerator.setApplianceType("Refrigerator");
		criteriaRefrigerator.add(Refrigerator.WIDTH, 77);
						
		appliance = service.find(criteriaRefrigerator);
				
		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");
		
		//////////////////////////////////////////////////////////////////
		
		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();
		criteriaSpeakers.setApplianceType("Speakers");
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 4);
		criteriaSpeakers.add(Speakers.CORD_LENGTH, "4");
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");
		
		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);
		System.out.println("*****************************");
	}
	
}
