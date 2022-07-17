package JavaSessions;

public class MainMerthodOverloading {
	
	/*
	 * Error: Main method not found in class JavaSessions.MainMerthodOverloading, 
	 * please define the main method as:
	 */

	public static void main(String[] args) {
		System.out.println("Main 1" +args); //[Ljava.lang.String;@5d22bbb7

	}
	
	public static void main(String a) {
		System.out.println("Main Method...");

	}
	
	public static void main(int a) {
		System.out.println("Main 2"+a);

	}
	
	public static void main(int a, int b) {
		System.out.println("Main 3"+ a + b);

	}

}
