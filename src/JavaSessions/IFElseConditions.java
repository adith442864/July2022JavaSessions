package JavaSessions;

public class IFElseConditions {

	public static void main(String[] args) {
		
		int a =20;
		int b =20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//dead code:
		if(false) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		int number = 90;
		
		if(number <= 100) {
		
			if(number >=90) {
				System.out.println("GRADE A");
			}
			
			if(number >=75) {
				System.out.println("GRADE B");
			}
		}
		

	}

}
