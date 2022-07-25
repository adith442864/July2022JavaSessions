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
		
		//contains
		String s1 = "your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		if(s1.contains("naveenautomation")) {
			System.out.println("PASS");
		}
		
		//comparison:
		String t1 = "hello java"; //string literals
		String t2 = "hello java";
		
		System.out.println(t1.equals(t2)); //true
		System.out.println(t1.equalsIgnoreCase(t2)); //true
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2); //comparing two object values:
		
		//interviewQ: after JDK 1.7 (SCP is part of HEAP Memory)
		String t3 = new String("hello ruby"); //new keyword -- object in heap - 2 objects(SCP + HEAP)
		String t4 = new String("hello ruby"); //1(heap)
		String t5 = "hello ruby"; //0
		System.out.println(t3==t4); //false --> comparing two object references
		System.out.println(t4==t5); //false
		
		//split()
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		//System.out.println(langArr[4]);
		//for each loop:
		for(String e: langArr) {
			System.out.println(e);
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr[0]); //blank value
		System.out.println(nameArr[1]); //testing
		System.out.println(nameArr[3]); //XSeleniumX
		//for each:
		for(String e: nameArr) {
			System.out.println(e);
		}
		
		String empData = "Hiren;Patel;40;NY;USA;01-01-1970;selenium;QA";
		String empDataArr[] = empData.split(";");
		for(String e: empDataArr) {
			System.out.println(e);
		}
		
		String credentials = "admin:admin123";
		System.out.println(credentials.split(":")[0]); //admin
		System.out.println(credentials.split(":")[1]); //admin123
		
		//substring() :
		String message = "your order is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0, 10));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		String orderId = message.substring(message.indexOf("is")+3, message.length());
		System.out.println(orderId);
		
		
		//interviewQ
		String text = "hOW aRe yOu";
		String textArr[] = text.split(" ");
		
		String remaining="";
		for(String words : textArr) {
			String first = text.substring(0,1);
			String second = text.substring(1).toLowerCase();
			remaining = first.toUpperCase() + second +" ";
		}
		
		System.out.println(remaining);
		
		
	}

}
