package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//two major limitations:
			//size of the array is fixed(static): to overcome this problem, use dynamic array -- ArrayList
			//similar type of data: to overcome this problem, use dyanamic array -- ArrayList/Static Object type array
		
		//use cases:
			//static data
			//months 12 /days 31
		
		//1. int array:
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
//		i[4]=50;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
//		System.out.println(i[4]); //ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i); //[I@1dbd16a6
		System.out.println(i[0]+i[2]);
		
		int len = i.length;
		System.out.println("Length = " +len);
		System.out.println("Hi = " +(len-1));
		System.out.println("Li = " +0);
		
		//print all the values from array:
		for(int k=0; k<len; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------");
		
		for(int k=0; k<=len-1; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------");
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------");
		//for each loop: enhanced for loop:
		for(int e: i) {
			System.out.println(e);
		}
		
		//double array:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=100;
		d[2]=33.33;
//		d[3]=21.33;		
//		System.out.println(d[3]); //ArrayIndexOutOfBoundsException
		
		System.out.println("------");
		for(double e : d) {
			System.out.println(e);
		}
		
		//char Array:
		char c[] = new char[3];
		c[0]='a';
		c[1]='$';
		c[2]='1';
		
		System.out.println("------");
		
		for(char e : c) {
			System.out.println(e);
		}
		
		System.out.println("------");
		
		//String array:
		String lang[] = new String[4];
		lang[0]="JAVA";
		lang[1]="PYTHON";
		lang[2]="JS";
		lang[3]="RUBY";
		System.out.println(lang[0] + lang[1]);
		
		for(int p=0; p<lang.length; p++) {
			System.out.println(lang[p] +" : " +p);
		}
		
		System.out.println("------");
		//for each:
		for(String s : lang) {
			System.out.println(s);
		}
		
		System.out.println("------");
		//Object Array:
		Object emp[] = new Object[4];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]='m';
		emp[3]=23.44;
		
		for(Object o: emp) {
			System.out.println(o);
		}
		
		//worst approach:
		String product[] = new String[100];
		product[0]="Macbook Pro";
		product[1]="Macbook Air";
		

	}

}
