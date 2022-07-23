package ExceptionHandling;

public class TryCatchBlock {
	
	String name;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name="Tom";
		//obj = null; //NullPointerException
		
		try {
			System.out.println(obj.name);//NPE
			int i = 9/0;
			System.out.println("hii");
			System.out.println("hii");
			System.out.println("hii");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception occured....");
			e.printStackTrace();
		}
//		catch(Exception e) {
//			System.out.println("some exception is coming...");
//			e.printStackTrace();
//		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		
		

	}

}
