package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.opdServices();
		fh.medicalTraining();
		USMedical.billing();
		fh.medicalInsurance();
		fh.covidTest();
		fh.medicalInfo();
		UNHG.covidGuideLines();
		
		
		//Create an object of the interface -- strictly not allowed
//		USMedical us = new USMedical(); //Cannot instantiate the type USMedical
		
		System.out.println("---------------");

		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us =new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.oncologyServices();
		us.physioServices();
		//USMedical.billing();
		us.medicalInsurance();
		
		System.out.println("---------------");
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();
		
		
		System.out.println("---------------");
		
		//down casting: Compile Time is not allowed
		//parent interface  object can be referred by child class ref variable
//		FortisHospital fh1 = (FortisHospital) new USMedical();
		
	}

}
