package MenuSys;

public class DrinksMenu extends MenuItem{
	
	private String Type;
	
	//Default Constructor
	public DrinksMenu() {
		
	}
	
	//Parameterized Constructor
	public DrinksMenu(int itemNum, String itemName, String Description, String Type, double itemPrice)
	{
		super(itemNum, itemName, Description, itemPrice);
		this.Type= Type;
		
	}
	
	//Setters
	public void setType(String Type) {
		this.Type= Type;
	}
	
	//Getters
	public String getType() {
		return Type;
	}
	
	public String toString() {
	
		String Print= "\nDrinksMenu" + "\nitemNum: " + getitemNum() + "\nitemName: " 
				+ getitemName() + "\nDescription: " + getDescription() + "\tType: " +Type + "\nitemPrice: $" +getitemPrice() ;
		
		return Print;
	}

}
