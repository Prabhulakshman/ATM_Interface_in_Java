package project_source_code;
import java.util.Scanner;
public class ATM {
public static void main(String []args)
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Welcome to our ATM Service");
	System.out.println("Enter ATM Number: ");
	long atm_no=s.nextLong();
	Account_Holder acc=new User();
	System.out.println("Enter Pincode: ");
	int pin=s.nextInt();
	acc.getatm_details(atm_no,pin);
	Bank_Transaction b=new Bank_Transaction();
	Account a=new Bank();
	boolean res=acc.check(atm_no, pin);
	if(res)
	{
	while(true)
	{
		System.out.println("Login Successfull");
		System.out.println("Choose a Valid Functionality\n1.Show Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit");
		System.out.println("Enter a Valid Choice: ");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			b.transaction_history();
			break;
		}
			
		case 2:
		{
			System.out.println("Enter Amount to be Withdrawn: ");
			double amount=s.nextFloat();
			 a.withdraw(amount);
			 break;
		}
			
		case 3:
		{
			System.out.println("Enter Amount to be Deposited: ");
			double amount=s.nextFloat();
			 a.deposit(amount);
			 break;
		}
			
		case 4:
		{
			System.out.println("Enter Transaction Amount: ");
			double amount=s.nextFloat();
			System.out.println("Enter Transaction Account's IFSC Code: ");
			String ifsc=s.next();
			System.out.println("Enter Transaction Account Number: ");
			String acc_no=s.next();
			a.transaction(amount,ifsc,acc_no);
			break;
		}
			
		case 5:
		{
			System.out.println("Quit\nThanks for Visiting our ATM Service\nHave a Nice Day!");
			System.exit(0);
		}
			
		default:
		{
			System.out.println("You Have Entered Wrong Choice");
		}
		
		}
		break;
	}
	
	s.close();
	
	}
	else
	{
		System.out.println("Kindly Re Enter Valid User Id and pincode and Try Again");
	}
}
	

}
