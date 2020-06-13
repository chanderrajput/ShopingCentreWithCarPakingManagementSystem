import java.util.Date;
import java.util.*;
public class ChaseUpTest
{
	private static Scanner scan;
	public static void main(String[] args)
	{
        scan = new Scanner(System.in);
		int id=0;

		Date date=new Date();
		ChaseUp chaseUp=new ChaseUp("The New ChaseUp Parking Shoping centre","Karachi",03403215000,"chaseup@gmail.com",100,0,date);
		ChaseUpFood foodArea=new ChaseUpFood();
		ChaseUpCosmetics cosmeticArea=new ChaseUpCosmetics();
		ChaseUpReception reception= new ChaseUpReception();
		ChaseUpPayment payment= new ChaseUpPayment();
		ChaseUpcustomer customer =new ChaseUpcustomer();
		ChaseUpVehicalCar vehicalCar = new ChaseUpVehicalCar();
		ChaseUpVehicalBike vehicalBike = new ChaseUpVehicalBike();		

		ArrayList<ChaseUpReception> customerList = new ArrayList<ChaseUpReception>();
		ArrayList<ChaseUpVehicalBike> bikeList = new ArrayList<ChaseUpVehicalBike>();
		ArrayList<ChaseUpVehicalCar> carList = new ArrayList<ChaseUpVehicalCar>();


        System.out.println("\n\n                    ====>      Wellcome to the New ChaseUp Parking Shoping centre      <====");

		System.out.println("\n\nEnter customer's name:");
		customer.setName(scan.nextLine());

		System.out.println("Enter customer's address:");
		customer.setAddress(scan.nextLine());

		System.out.println("Enter customer's emailaddress:");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		customer.setEmail(scan.nextLine());

		System.out.println("enter customer's cellNo:");
		customer.setCellNo(scan.nextLong());


		System.out.println("\n\n             Hello "+customer.getName());

		System.out.println("\n\nSelect the vehical Type: \n");

		System.out.println("1. Car.\n2. Bike.");
		
		boolean conditoin=true;
		int type=0;

		while(conditoin){
			type = scan.nextInt();
			if(type==1 || type==2){
				conditoin=false;
			}else{
				System.out.println("Please select the correct input.\n");
			}
		}

		

		switch (type)
		{
			case 1:
				{
					vehicalCar.setType("car");
					System.out.println("Enter the car plate number:");
					vehicalCar.setNoPlate(scan.next());
					vehicalCar.setBookigId(id+=1);
					chaseUp.vehicalIn();
					customerList.add(reception);
					carList.add(vehicalCar);
					customer.setCstmrCar(carList);
					System.out.println("\n"+customer.car());
					System.out.println("\nPlease go to parking no "+vehicalCar.getBookigId());
					break;
		}
		case 2:
			{
			vehicalBike.setType("bike");
				System.out.println("Enter the bike plate number:");
				vehicalBike.setNoPlate(scan.next());						                    	
				vehicalBike.setBookigId(id+=1);
				chaseUp.vehicalIn();
				customerList.add(reception);
				bikeList.add(vehicalBike);
				customer.setCstmrBike(bikeList);
				System.out.println("\n"+customer.bike());
				System.out.println("\nPlease go to parking no "+vehicalBike.getBookigId()+" for Shoping.");

				break;
			}
		default:
			{
				System.out.println("Please enter the write input");
				System.exit(0);
			}
		}

		System.out.println("\n\nSelect the area Type \n");

		System.out.println("1. Food Area\n2. Cosmetics Area");
		int area=0;
		while(!conditoin){
			area=scan.nextInt();
			if(area==1 || area==2){
				conditoin=true;
			}else{
				System.out.println("Please select the correct input.\n");
			}

		}
		
		if(area==1)
		{
			System.out.println("\n\n       ===>   Welcome to the Food Market   <===\n");

			foodArea.order();
			foodArea.discount(foodArea.getTotalPrice());
 	
	
			System.out.println("\nYour total bill of Food item is "+foodArea.getTotalPrice());
			System.out.println("\nOn the Food shoping of "+foodArea.getTotalPrice()+" you get the discount of "+foodArea.getDiscount());

			foodArea.setTotalPrice((foodArea.getTotalPrice()-foodArea.getDiscount()));
			System.out.println("\nYour total bill after discount is "+foodArea.getTotalPrice());
	
			System.out.println("\n\ndo you want to go to cosmetic area.\nIf yes then press Y else N: ");
			String nextArea=scan.next();
	
			if(nextArea.equalsIgnoreCase("y"))
			{
				System.out.println("\n\n       ===>   Welcome to the Cosmetic Market   <===\n");
	
				cosmeticArea.order();
				cosmeticArea.discount(cosmeticArea.getTotalPrice());

				System.out.println("\nYour total bill of cosmetics item is "+cosmeticArea.getTotalPrice());
			 	System.out.println("\nOn the cosmetics shoping of "+cosmeticArea.getTotalPrice()+" you get the discount of "+cosmeticArea.getDiscount());

				cosmeticArea.setTotalPrice((cosmeticArea.getTotalPrice()-cosmeticArea.getDiscount()));
			    System.out.println("\nYour total bill of cosmetics item after discount is "+cosmeticArea.getTotalPrice());
			}			
		}
		else if(area==2)
		{
			System.out.println("\n\n       ===>   Welcome to the Cosmetic Market   <===\n");

		    cosmeticArea.order();
			cosmeticArea.discount(cosmeticArea.getTotalPrice());
	
		    System.out.println("\nYour total bill of Cosmetics item is "+cosmeticArea.getTotalPrice());
 			System.out.println("\nOn the cosmetic shoping of "+cosmeticArea.getTotalPrice()+" you get the discount of "+cosmeticArea.getDiscount());

			cosmeticArea.setTotalPrice((cosmeticArea.getTotalPrice()-cosmeticArea.getDiscount()));
 		    System.out.println("\nYour total bill after discount is "+cosmeticArea.getTotalPrice());

			System.out.println("\n\ndo you want to go to Food area.\nIf yes then press Y else press N:	");
			String nextArea=scan.next();
	
			if(nextArea.equalsIgnoreCase("Y"))
			{
				System.out.println("\n\n       ===>   Welcome to the Food Market    <===\n");

        		foodArea.order();
				foodArea.discount(foodArea.getTotalPrice());
 	
				System.out.println("\nYour total bill of Food item is "+foodArea.getTotalPrice());
				System.out.println("\nOn the Food shoping of "+foodArea.getTotalPrice()+" you get the discount of "+foodArea.getDiscount());

				foodArea.setTotalPrice((foodArea.getTotalPrice()-foodArea.getDiscount()));
			        System.out.println("\nYour total bill after discount is "+foodArea.getTotalPrice());
			}


		}
		else
		{
			System.out.println("Please enter the correct option");
			System.exit(0);
		}

		reception.setFinalBill((foodArea.getTotalPrice()+cosmeticArea.getTotalPrice()));
		payment.setCash(reception.getFinalBill());
		

		System.out.println("\n\nyour final bill is "+reception.getFinalBill());
		payment.paymentOption();			

		System.out.println("\n\n	===>  Here is your recept.  <===");
		System.out.println(chaseUp.toString());						
		System.out.println(customer.toString());
		System.out.println("Customer bill is "+reception.getFinalBill());
		reception.terms();

		System.out.println("\n\nPlease collect your bags from exit gate by showing this recipt.");


		System.out.println("\n\n                   ===>   Thanks for choosing ChaseUp Shoping centre   <===");

	}
}
