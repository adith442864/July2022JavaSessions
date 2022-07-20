package OOP_Interface;

// multiple inhertiance:

public class FortisHospital extends UNHG implements USMedical, UKMedical,IndianMedical {
	
	//US:
	@Override
	public void physioServices() {
		
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}
	
	//Default method is overridden:
	@Override
	public void medicalInsurance() {
		System.out.println("FH -- medical insurance");
	}
	
	//UK
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
		
	}
	
	//IndianMedical
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}
	
	//Fortis Hospital -- individual methods:
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}
	
	public void opdServices() {
		System.out.println("FH -- OPD services");
	}
	
	//common across all Interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergency services");
		
	}

	@Override
	public void covidTest() {
		System.out.println("FH -- covid Test");
		
	}
	
	
	

}
