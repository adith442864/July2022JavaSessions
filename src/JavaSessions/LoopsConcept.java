package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1 to 10:
		//1. while loop:
		int i=1; //start
		while(i<=10) { //conditional 
			System.out.println(i);
			//i++;
			//++i;
			i=i+1; //incremental/decremental
		}
		
		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k==20) {
				break;
			}
		}
		
		System.out.println("----------------------------");
		//infinite loop:
//		while(true) {
//			System.out.println("welcome to Hetel Taz...");
//		}
		
		//facebook/linkedin app: lazy page loading
		//use cases: we have to use while loop when we are not sure about number of cycles/iterations
			//pagination 
			//carousle
			//calendar handle

		//2. for loop:
		//typical for loop: (index based for loop)
		//1 to 10:
//		for(int p=1; p<=10; p++) {
//			System.out.println(p);
//		}
		
//		int p=1;
//		for(; p<=10; p++) {
//			System.out.println(p);
//		}
		
		int p=1;
		for(; p<=10; ) {
			System.out.println(p);
			//p++;
			//++p;
			p=p+1;
		}
	
		//infinite for loop:
		for(int g=1; g<=10; ) {
			System.out.println(g);
		}
		

	}

}
