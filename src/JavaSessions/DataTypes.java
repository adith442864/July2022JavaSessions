package JavaSessions;


public class DataTypes {
	
	//this is my first java code
	
	public static void main(String[] args) {
		
		//Data types:
		//strict type:
		
		int x = 10;
		
		//1. primitive Data Types: Dont need any object
		
		//1. Boolean Type : boolean(true/false)
		//2. Numeric Type:
			//1. character type:
			//2. Integral Type:
				//1. Integer: byte, short, int, long
				//2. Floating-point: float, double
		
		
		//2. Non primitive data types: need to create the object
			//String, Array, Interface, Classes
		
		//1. byte : 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		b = 20;
		b=30;
		
		byte b1=40;
		byte b2=120;
//		byte b3=130; //out of the range
		byte b4 = -120;
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b+b1);
		
		//2.short
		//size: 2 bytes = 16 bits 
		//range: -32768 to 32767
		
		short s1 = 1234;
		System.out.println(s1);
		
		
		//3. int
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		
		int i=23450;
		int i1=-190;
		
		System.out.println(i);
		System.out.println(i1);
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: -9223373036854775808 to 9223373036854774807
		
		long pop = 1000000200;
		long g = 9993434393434343L;
		
		System.out.println(g);
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after . (up to 7 decimal digits)
		
		float f1=12.33F;
		float f2 = (float) 34.55;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		float f3=100;
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range : after . (up to 16 decimal digits)
		
		double d = 12.33;
		double d1 = 34.55555;
		double d3 = 1.1;
		
		//7. character
		//size: 2 bytes = 16 bits
		//single digit value
		
		char c1 = 'a'; //a-z and A-Z
		char c2='1'; //0-9
		char c3 = '#';
		
		//chinese, unicode char support
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//8. boolean: true/false
		//size: ~1 bit /default : false
		boolean flag  = true;
		boolean flag1 = false;
		System.out.println(flag);
		System.out.println(flag1);
		

	}

}
