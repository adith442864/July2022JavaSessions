package JavaSessions;

public class ObjectReferenceConcept {
	
	//class data members:
	//class vars
	String name;
	int age;
	
	//class methods:
	public void get() {
		System.out.println("get method...");
	}

	public static void main(String[] args) {
	
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
		//object reference to null:
//		obj = null;
//		
//		obj.name="Tom"; //java.lang.NullPointerException
//		obj.age=25;
//		
//		System.out.println(obj.name+" " +obj.age); 
		
		//no reference object:
		new ObjectReferenceConcept().name="Peter";
		new ObjectReferenceConcept().age=25;
		new ObjectReferenceConcept().get();
		
		ObjectReferenceConcept obj1 = new ObjectReferenceConcept();
		
		System.gc();
		
		
	}

}
