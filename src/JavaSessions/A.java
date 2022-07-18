package JavaSessions;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("A -- main"); //java.lang.StackOverflowError
		B.main(args);

	}

}
