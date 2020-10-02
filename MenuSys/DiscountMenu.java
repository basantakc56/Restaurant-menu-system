package MenuSys;

public class DiscountMenu extends MenuItem {
	
	private String Type;
	private double Discount;
	
	//Default Constructor
	public DiscountMenu() {
		
	}
	
	//Parameterized Constructor
	public DiscountMenu(int itemNum, String itemName, String Description, String Type, double itemPrice, double Discount)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Type= Type;
		this.Discount= Discount;
	}
	
	//Setters
	public void setType(String Type) {
		this.Type= Type;
	}
	
	public void setDiscount(double Discount) {
		this.Discount= Discount;
	}
	
	//Getters
	public String getType() {
		return Type;
	}
	
	public double getDiscount() {
		return Discount;
	}
	
	
	
	public String toString()
	{
		String Print= "\nDiscountMenu" + "\nitemNum: " + getitemNum() + "\nitemName: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\tType: " +Type + "\nitemPrice: $" +getitemPrice() +"\nDiscount :" +Discount +"%";
		
		return Print;
	}
	

}
