package project_source_code;

public class Bank implements Account{
	 static double minimum_balance=5000;
	 static double total_balance=50000;
	
	public  void withdraw(double amount)
	{
		if(amount<=total_balance && amount>minimum_balance)
		{
			total_balance=total_balance - amount;
			System.out.println("Amount Withdrawn Successfully,Total Available Balance is "+total_balance);
			Bank_Transaction.count_transaction++;
		}
		else
		{
			System.out.println("We cannot process Withdrawal Process due to In-Sufficient Balance,Total Available Balance is "+total_balance);
		}
	}
	public  void deposit(double amount)
	{
		if(amount >0)
		{
			total_balance=total_balance + amount;
			System.out.println("Amount Deposited Successfully,Total Available Balance is "+total_balance);
			Bank_Transaction.count_transaction++;
		}
	}
	public  void transaction(double amount,String ifsc,String acc_no)
	{
		
		boolean check_ifsc=false;
		boolean check_acc=false;
		for(int i=0;i<Account.ifsc.length;i++)
		{
			if(ifsc.equals(Account.ifsc[i]))
					{
						check_ifsc=true;
					}
		}
		for(int i=0;i<(Account.acc_no.length);i++)
		{
			if(acc_no.equals(Account.acc_no[i]))
					{
					    check_acc = true;
					}
		}
		 if(check_ifsc && check_acc)
		{
			deposit(amount);
			System.out.println("Transaction Successfull");
			Bank_Transaction.count_transaction++;
		}
		 else
		 {
			 if(!check_ifsc && !check_acc)
			 {
				 System.out.println("Entered Both IFSC code and Account Number is Wrong.Please Enter Valid IFSC Code and Account Number and Try Again");
			 }
		     else if (!check_ifsc || check_acc)
			 {
				 System.out.println("Entered IFSC Code is Wrong.Please Enter Valid IFSC Code  and Try Again");
			 }
			 else if(check_ifsc || ! check_acc)
			 {
				 System.out.println("Entered Account Number is Wrong.Please Enter Valid  Account Number and Try Again");
			 }	    
			
			 System.out.println("Transaction Un Sucessfull");
		 }
		 }

}
