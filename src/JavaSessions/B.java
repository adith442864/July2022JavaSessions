package JavaSessions;

public class B {

	public static void main(String[] args) {
		
		System.out.println("B -- main"); //java.lang.StackOverflowError
		A.main(args);

	}

}
