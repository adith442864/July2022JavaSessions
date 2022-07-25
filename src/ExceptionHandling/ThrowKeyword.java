package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		//custom exception:
		try {
			throw new Exception("MYEXCEPTION");
		} catch (Exception e) {
			System.out.println("SOME EXCEPTION IS COMING....");
			e.printStackTrace();

			try {
				int i = 9 / 0;
			} catch (ArithmeticException e1) {
				System.out.println("AE is coming...");
				e1.printStackTrace();
			}

		}
		
		
		String data = null;
		
		if(data == null) {
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			}
			catch(Exception e) {
				System.out.println("DataNOTFOUND Exception is coming");
				e.printStackTrace();
			}
		}
		
		//webpage -- element e1
		//e1 is not not present
		//e1 prop is missing --> throw new Exception("ELEMENTPROPNOTFOUNDEXCEPTION")
		
	}

}
