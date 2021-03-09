import java.util.*;
public class Account{
	public double balance;
	public double transecton;
	public String AccountHolderName;
	public String AccountHolderID;
	public Account(String AccountHolderName, String AccountHolderID){
		this.AccountHolderName = AccountHolderName;
		this.AccountHolderID = AccountHolderID;
	}
	public void amountDeposit(double amount){
		if(amount != 0.0){
			balance = balance + amount;
			transecton = amount;
		}
	}
	public void amountWithDraw(double amount){

		if(amount != 0.0){
			balance = balance - amount;
			transecton = -amount;
			}
	}
	public void showPreviousTransection(){
		if(transecton > 0.0){
			System.out.println("Deposited: " +  transecton);
		}
		else if (transecton < 0.0){
			System.out.println("WithDraw: " + Math.abs(transecton));
		}
		else
		{
			System.out.println("No Transection Occured");
		}
	}
	public void interestCalculation(int year){
		double interstRate = 0.0254;
		double anuallyInterest = (interstRate * 100  * year);
		double totalAmount = anuallyInterest + balance;
		System.out.println("The current Interest rate is " + (interstRate * 100));
		System.out.println("After " + year + " years " + AccountHolderName + " will get " + totalAmount);
		
	}
	public void showMenu(){
		char option = '\0';
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome " + AccountHolderName);
		System.out.println("Your Bank Account No is: " + AccountHolderID);
		System.out.println();
		System.out.println("MY BANK");
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A: Check Your Balance");
		System.out.println();
		System.out.println("B: Deposit Money.");
		System.out.println();
		System.out.println("C: WithDraw Money");
		System.out.println();
		System.out.println("D: View Previous Transection");
		System.out.println();
		System.out.println("E: Calculate the Annually Interest");
		System.out.println();
		System.out.println("F: To Exist");
		do{
			System.out.println();
			System.out.println("Please Choose the Option:");
			char option1 = scan.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			if(option == 'A')
			{
				System.out.println("-------------------------------------");
				System.out.println("Your Current Balance is " + balance + " Huf.");
				System.out.println("-------------------------------------");
			}
			else if(option == 'B')
			{
				System.out.println("---------------------------------");
				System.out.println("Please Enter the Amount you want to Deposit.");
				double money = scan.nextDouble();
				amountDeposit(money);
				System.out.println("---------------------------------");
			}	
			else if(option == 'C')
			{
				System.out.println("-------------------------------");
				System.out.println("Please Enter the Amount you want to WithDraw.");
				double money1 = scan.nextDouble();
				amountWithDraw(money1);
				System.out.println("---------------------------------");
			}
			else if(option == 'D')
			{
				System.out.println("-------------------------------");
				showPreviousTransection();
				System.out.println("-------------------------------");
			}
			else if(option == 'E')
			{
				System.out.println("--------------------------------");
				System.out.println("Enter The Years.");
				int year = scan.nextInt();
				interestCalculation(year);
				System.out.println("--------------------------------");
			}
			else 
			{
				System.out.println("-----------------------------");
				System.out.println("Invalid Option!! You can Enter Only A B C D E and F only.");
				System.out.println("-----------------------------");
			}	
		}
		while(option != 'F');
		System.out.println("Thank  You for Choosing MyBank");
			
		
		
	}
	
	
}