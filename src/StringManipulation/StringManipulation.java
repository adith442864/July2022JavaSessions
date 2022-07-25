package StringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
	
		String s = "This is my java code and I am so happy java is best";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0)); //0th position
		System.out.println(s.charAt(37));
//		System.out.println(s.charAt(38)); //StringIndexOutOfBoundsException
//		System.out.println(s.charAt(-1)); //StringIndexOutOfBoundsException
		
		System.out.println(s.indexOf('j')); //11
		System.out.println(s.indexOf('i')); //2 (1st occurence of i)
		System.out.println(s.indexOf('i',3)); //5
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf('i', s.indexOf('i',s.indexOf('i')+1)+1)); //2nd and 3rd occurence
		
		System.out.println(s.indexOf("code")); //16
		System.out.println(s.indexOf("python")); //-1
		
		String mesg = "Welcome Admin";
		
		if(mesg.indexOf("Admin") > 0) {
			System.out.println("PASS");
		}
		
		//LowerCase() and UpperCase():
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//trim()
		String str = "     hello world     ";
		System.out.println(str.trim());
		
		//replace()
		System.out.println(str.replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		
		
		
		
		
		
		
		
		

	}

}
