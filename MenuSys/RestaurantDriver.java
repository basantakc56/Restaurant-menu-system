package MenuSys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class RestaurantDriver {
	
public static void straightLine() 
	{
		System.out.println();
		int i;
		for (i = 0; i < 50; i++){
			System.out.print("*");}
		System.out.println();
		} 

public static void date() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.print(dtf.format(now) + "\n");  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner group= new Scanner(System.in);
		int CusChoice= -1;
		boolean Signal= false;
		int ID;
		double Total= 0, Discount, DisAmount, TotalAmount;
		String Name, Status;
		
		String POrder; 		
		ArrayList <MenuItem> Restro= new ArrayList<>(); //Creating Restro ArrayList
		
		
		
		Menu SPDD= new Menu("Lunch", "Afternoon", "Kathmandu"); //Creating BookStore Object
		
		
		//	Creating objects for Standard Menu	
		MenuItem S1= new StandardMenu(101, "Chicken Momo","Medium spiced filling wrapped in pastry and steamed.", "Nepalese Street Food", 16.90);
		MenuItem S2= new StandardMenu(102, "Vegetable Samosa(2pcs)", "Spiced veg in-cased in homemade crispy pastry w/ mint sauce", "Starter", 11.90);
		MenuItem S3= new StandardMenu(103, "Aloo Tikki(2pcs)", "Deep fried mashed potato & green peas patty topped up with sauces w/ mint sauce", "Starter", 11.90);
		MenuItem S4= new StandardMenu(104, "TRADITIONAL THAKALI THALI SET", "Popularly known as ‘daal-bhaat-tarkari. boiled rice, Goat curry, lentil, spinach  with salad", "House Dishes", 25.90);
		MenuItem S5= new StandardMenu(105, "POLEKO SEKUWA", "Smoked and grilled in a clay oven with Himalayan spices.", "Nepalese Street Food", 19.90);
		MenuItem S6= new StandardMenu(106, "SADHEKO GOAT SUKUTI", "Homemade Goat jerky pan fried with spices, onions and garlic", "Nepalese Street Food", 21.90);
		MenuItem S7= new StandardMenu(107, "BHUTEKO GOAT BHUTAAN", "Pan fried goat innards, with spices, onions, ginger and garlic", "Nepalese Street Food", 20.90);
		MenuItem S8= new StandardMenu(108, "PIRO CHOYLA", "Marinated overnight with mustard oil, ginger, garlic, chilli & spices", "Nepalese Street Food", 19.90);
		MenuItem S9= new StandardMenu(109, "FESTIVAL SET", "Mostly eaten on feast and festival. Choyla, bhatmas, aaloo-achar & chiuwra", "Snack Set", 22.90);
		MenuItem S10= new StandardMenu(110, "FISH PAKODA (4 pcs)", "Fish stripes lightly spiced and deep fried in chick-pea flour w/ mint sauce", "Starter", 15.90);
		
		
		
		// Creating objects for Premium Menu		
		MenuItem P1= new PremiumMenu(201, "Teel ko Jhol MOMO", "Dumpling top up with spicy sesame seeds chutney & coriander", "Nepalese Street Food", 16.90, 0.50);
		MenuItem P2= new PremiumMenu(202, "CHOWMEIN NOODLES", "Stir-fried noodles with vegies, spring onions & coriander in special sauce", "Nepalese Street Food", 17.90, 2.30);
		MenuItem P3= new PremiumMenu(203, "SPICY CHILLI MOMO (5 pcs)", "Minced Chicken, Dumpling tossed in hot chilli sause with capsicums & onions", "Nepalese Street Food", 12.90, 1.50);
		MenuItem P4= new PremiumMenu(204, "TRADITIONAL FAPARKO DHIDO", "Buckwheat flour pudding (with melted ghee and timurko chhop),curry (goat/chicken), lentil, spinach, mix spicy pickle, bitter melon pickle & tomato chutney assorted with yogurt", "House Dishes", 27.60, 2.50);
		MenuItem P5= new PremiumMenu(205, "NEPALESE GOAT CURRY", "Boneless diced goat slow-cooked in blended flavours of cinnamon, tomato, coriander and bay leaves", "House Dishes", 24.40, 1.60);
		MenuItem P6= new PremiumMenu(206, "MIX TANDOORI GRILL", "Chicken tikka, shish kebab,tandoori chicken & tandoori king prawn", "Sizzler", 28.70, 2.10);
		MenuItem P7= new PremiumMenu(207, "AALOO BODI TAMA", "Potato, black eye beans and bamboo shoots slow cooked in traditional way with a pungent flavour", "Vegetarian", 18.90, 1.40);
		MenuItem P8= new PremiumMenu(208, "MALAI KOFTA", "Vegetable balls of scrambled cottage cheese & mashed potatoes in rich mild sauce", "Vegetarian", 20.90, 1.50);
		MenuItem P9= new PremiumMenu(209, "NEPALESE FISH CURRY", "Fish cubes cooked with the Himalayan herbs in tangy sauce", "Seafood", 23.90, 0.80);
		MenuItem P10= new PremiumMenu(210, "MATTER PANEER MASALA", "North Indian curry cooked with matter (peas) & paneer (cottage cheese) with spices", "Vegetarian", 20.90, 2.00);
		
		
		// Creating objects for Discount Menu
		MenuItem Di1= new DiscountMenu(301, "STEAM MOMO", "Chicken mince medium spiced filled wrapped in pastry and steamed, served with tomato chutney", "Nepalese Street Food", 14.40, 2.00);
		MenuItem Di2= new DiscountMenu(302, "MIX VEG CURRY","Seasonal mix veggies cooked with spices & herbs", "Vegetarian", 17.90, 1.00);
		MenuItem Di3= new DiscountMenu(303, "LAMB KORMA", "Diced lamb cooked in onion & cashew nuts based gravy finished with almonds & cream", "Lamb", 21.90, 1.50);
		MenuItem Di4= new DiscountMenu(304, "PRAWN MALABAR", "Prawn curry with herbs & a touch of coconut cream", "Seafood", 22.90, 2.00);
		MenuItem Di5= new DiscountMenu(305, "AALOO GOBI TARKARI", "Potato and cauliflower sauteed with onions & herbs", "Vegetarian", 17.90, 1.20);
		MenuItem Di6= new DiscountMenu(306, "HIMALAYAN CHICKEN MASALA", "Boneless chicken tempered with cumin seeds in ground spices", "Chicken", 22.00, 0.90);
		MenuItem Di7= new DiscountMenu(307, "YELLOW DAAL TADKA", "lentils cooked with onion, tomato, ginger & garlic", "Vegetarian", 16.80, 1.50);
		MenuItem Di8= new DiscountMenu(308, "CHANA MASALA", "Chick peas slow cooked with herbs and spices", "Vegetarian", 17.60, 1.00);
		MenuItem Di9= new DiscountMenu(309, "GOLDEN PRAWN (4 pcs)", "Sesame seeds coated prawn, deep fried in corn flour batter w/ mint sauce", "Starter", 16.70, 2.50);
		MenuItem Di10= new DiscountMenu(310, "BIRYANI", "Cooked with medium spiced aromatic saffron rice served with raita", "Biryani", 18.90, 3.10);
		


		
		//Creating objects for Drinks Menu
		MenuItem D1= new DrinksMenu(401, "BREAKFAST SMOOTHIE", "Berries, hemp seeds, coconut yoghurt, avocado, banana & coconut water", "Smoothie", 9.50);
		MenuItem D2= new DrinksMenu(402, "BETTER THAN CHOCOLATE", "Almond milk, banana, cocoa, pea protein & coconut water", "Smoothie", 8.25);
		MenuItem D3= new DrinksMenu(403, "MANGO TANGO", "Mango, orange, juice & banana", "Smoothie", 8.50);
		MenuItem D4= new DrinksMenu(404, "GREEN GODDESS JUICE", "Celery, green apple, spinach, lime ginger & mint", "Juice", 7.00);
		MenuItem D5= new DrinksMenu(405, "ORANGE ZING JUICE", "Orange, carrot, turmeric, lemon & ginger", "Juice", 7.50);
		MenuItem D6= new DrinksMenu(406, "KICKSTARTER JUICE", "Celery, beetroot, carrot, apple, lemon & ginger", "Juice", 7.50);
		MenuItem D7= new DrinksMenu(407, "ALPINE ALE", "An Australian ale with apline attitude, easy going yet adventurous", "Beer", 20.90);
		MenuItem D8= new DrinksMenu(408, "PILOT", "Big on flavour yet low on alcohol, a modern sesstion ale", "Beer", 18.60);
		MenuItem D9= new DrinksMenu(409, "BRIGHT LAGER", "A classic Australian unfiltered lager", "Beer", 17.50);
		MenuItem D10= new DrinksMenu(410, "BUNDABERG PASSIONFRUIT", "Real, natural & unique made with passion fruit", "Soft Drink", 4.50);
		
		
		
		
		
		System.out.println("Do you want to place an order?(Yes/No)");
		POrder= group.nextLine();
		if(POrder.equalsIgnoreCase("Yes"))
		{
			//Adding Customer
		Customer Cus= new Customer();
		System.out.println("Enter the customer name: ");
		Name= group.nextLine();
		
		System.out.println("Enter the customer ID: ");
		ID= group.nextInt();
		group.nextLine();
		
		System.out.println("Enter the status: \n-Active\n -VIP\n -New\n ");
		Status= group.nextLine();
		
		System.out.print("\nWELCOME TO HANDOS NEPALESE RESTAURANT\n");
		System.out.println("\nDeveloped by: \nK200367 Basant KC  \nK200318 Bhuwan Raut \nK200348 Ranjesh KC \nK200338 Rabin Bhandari");
		
		//Creating Customer
		Cus.setCustomerID(ID);
		Cus.setCustomerName(Name);
		Cus.setCusStatus(Status);
		
		//Adding items to Menu
		SPDD.List.add(S1);
		SPDD.List.add(S2);
		SPDD.List.add(S10);
		SPDD.List.add(S8);
		SPDD.List.add(P1);
		SPDD.List.add(P7);
		SPDD.List.add(P6);
		SPDD.List.add(P9);
		SPDD.List.add(Di1);
		SPDD.List.add(Di3);
		SPDD.List.add(Di5);
		SPDD.List.add(Di10);
		SPDD.List.add(D1);
		SPDD.List.add(D3);
		SPDD.List.add(D9);
		SPDD.List.add(D5);
		
		
		
		
		straightLine(); // calls straightLine method
		//Printing Menu List
		System.out.printf("%25s","MENU LIST");
		straightLine();
		System.out.println(SPDD);
		Iterator<MenuItem> MI= SPDD.List.iterator();
		
		while(MI.hasNext())
		{
			System.out.println(MI.next());
		}
		
		//Item Selection
		while(CusChoice != 0)
		{
			System.out.print("\nChoose and enter the item number from the menu(Enter 0 for exit): ");
			CusChoice = group.nextInt();
			
			if(CusChoice == 0)
				System.out.println("\nYour order has been completed");
			else
			{
				Signal= false;
				for(int i= 0; i <SPDD.List.size(); i++)
				{
					if (CusChoice == SPDD.List.get(i).getitemNum())
					{
						Total += SPDD.List.get(i).getitemPrice();
						
						Restro.add(SPDD.List.get(i));
						
						
						System.out.println(SPDD.List.get(i).getitemName() +" ---Added.");
						Signal = true;
						
					}
				}
				if (!Signal)
					System.out.println("\nItem does not exist.. \nPlease choose the correct item number from the menu.");
			}
		}
		
		//Printing the selection
		
		straightLine(); //calling straightLine Method
		System.out.printf("%25s","INVOICE");
		straightLine(); //calling straightLine Method
		
		Iterator<MenuItem> R= Restro.iterator();
		while(R.hasNext())
		{
			System.out.println(R.next());
		}
		
		straightLine(); //calling straightLine Method
		
		System.out.println(Cus);
		Discount= Cus.getDiscount();
		DisAmount = Total * Discount;
		TotalAmount = Total - DisAmount;
		
		straightLine(); //calling straightLine Method
		System.out.printf("%s: %15.2f","Total",Total); 
		System.out.printf("\n%s: %12.2f","Discount",DisAmount);
		System.out.printf("\n%s: %13.2f","Payable",TotalAmount);
		straightLine();
		date();
		System.out.println("Thanks for your order");
		
		}
		else {
		System.out.println("Thank you for visiting. Have a great day");
			System.exit(0); //Exits the system
		}
		group.close();
		
		
		
		
		
		
		
		
			
		}
		
	}


