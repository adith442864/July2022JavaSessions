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
			//carousel
			//calendar handle

		//2. for loop:
			//use cases:
				//we have to use for loop when we are sure about number of cycles/iterations
				//menu items
				//total number of links/images on the page
				//drop down values
				//webtable  -- rows/cols
		
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
	
		//1. infinite for loop:
//		for(int g=1; g<=10; ) {
//			System.out.println(g);
//		}
		
		//2.
//		for(;;) {
//			System.out.println("Welcome to hotel taj");
//		}
		
		System.out.println("----------------------------------------");
		
		//print even numbers up to 10:
		for(int even=2; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		System.out.println("----------------------------------------");
		
		for(int odd=1; odd<=10; odd=odd+2) {
			System.out.println(odd);
		}
		
		System.out.println("----------------------------------------");
		for(double d=1.0; d<=10.0; d++) {
			System.out.println(d);
		}
		
		System.out.println("----------------------------------------");
		//A-Z 
		for(char c='A'; c<='Z';c++) {
			System.out.println(c);
		}
		
		//print ascii value equivalent char:
		System.out.println("----------------------------------------");
		for(int as=97; as<=122; as++) {
			System.out.println((char)as);
		}
		
		System.out.println("----------------------------------------");
		System.out.println(10%2); //0 (remainder)
		System.out.println(10%4); //2
		
		System.out.println("----------------------------------------");
		
		for(int t=1; t<=100; t++) {
			System.out.println(t);
			if(t%5==0) {
				System.out.println("hi");
			}
		}
		
		//print even numbers with % operator:
			//11(11%2==1)
			//10(10%2==)
		
		for(int m=2; m<=20; m++) {
			if(m%2==0) {
				System.out.println(m);
			}
		}
		
		System.out.println("----------------------------------------");
		
		//do-while:
		//use case:
			//wait -- custom wait
			//element is displayed
		int r=1;
		do {
			r++;
			System.out.println(r);
			break;
		} 
		while (r<=10);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
