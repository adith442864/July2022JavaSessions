package JavaSessions;

public class ObjectReferenceConcept {
	
	String name;
	int age;
	
	public void get() {
		System.out.println("get method...");
	}

	public static void main(String[] args) {
	
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		obj.name="Tom";
		obj.age=25;
		
		System.out.println(obj.name+" : " +obj.age);
		
		obj.get();
	}

}
