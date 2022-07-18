package JavaSessions;

public class StaticBlock {
	
	static {
		System.out.println("This is static block");
	}
	
	public static void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		
		System.out.println("this is main");
		test();

	}

}
