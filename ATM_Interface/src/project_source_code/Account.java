package project_source_code;

public interface Account {
boolean validate=false;

static String []ifsc= {"123SBI","357ICICI","680HDFC","3467LVB","673847MCB","55687AXIS"};
static String []acc_no= {"12345","3568","7654","7865","5432","5689"};
public  void withdraw(double amount);
public  void deposit(double amount);
public  void transaction(double amount,String ifsc,String acc_no);

}
