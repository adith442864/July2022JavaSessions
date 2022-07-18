package OOP_Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	public String hq;
	
	//getter
	public int getSharePrice() {
		return sharePrice;
	}
	
	//setter:
	public void setSharePrice(int sharePrice) {
		this.sharePrice=sharePrice;
	}
	

	public static void main(String[] args) {
		
		Company obj = new Company();
		obj.name="google";
		obj.sharePrice=100;
		obj.hq="USA";

	}

}
