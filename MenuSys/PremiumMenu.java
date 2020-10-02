package MenuSys;

public class PremiumMenu extends MenuItem {

	private String Type;
	private double Surcharge;
	
	//Default Constructor
	public PremiumMenu() {
		
	}
	
	//Parameterized Constructor
	public PremiumMenu (int itemNum, String itemName, String Description, String Type, double itemPrice, double Surcharge)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Type= Type;
		this.Surcharge= Surcharge;
		
	}
	
	//Setters
	public void setType(String Type) {
		this.Type= Type;
	}
	
	public void setSurcharge(double Surcharge) {
		this.Surcharge= Surcharge;
	}
	
	//Getters
	public String getType() {
		return Type;
	}
	
	public double getSurcharge() {
		return Surcharge;
	}
	
	
	public String toString()
	{
		String Print= "\nPremiumMenu" + "\nitemNum: " + getitemNum() + "\nitemName: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\tType: " +Type + "\nitemPrice: $" +getitemPrice() +"\nSurcharge:" +Surcharge +"%";
		
		return Print;
	}
}
