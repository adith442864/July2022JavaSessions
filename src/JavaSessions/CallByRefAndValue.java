package JavaSessions;

public class CallByRefAndValue {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(CallByRefAndValue br) {
		System.out.println(br.name+" " +br.version+" " +br.vendor);
	}
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		CallByRefAndValue b = new CallByRefAndValue();
		b.getInfo(b); //null 0.0 null
		b.name="chrome";
		b.version=91.1;
		b.vendor="google";
		//call by reference/pass by reference
		b.getInfo(b); //chrome 91.1 google
		
		b.sum(10, 20); //call by value/pass by value
		
	}

}
