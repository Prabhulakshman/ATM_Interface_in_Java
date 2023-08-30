package project_source_code;
import java.util.HashMap;
interface Account_Holder {
	void getatm_details(long atm_no,int pin);
	public  boolean check(long atm_no,int pin);
	
}
class User implements Account_Holder{
	 private long atm_no=0l;
	 private int pin=0;
	
	 HashMap<Long,Integer> acc_list=new HashMap<Long,Integer>();
	 
	@Override
	public void getatm_details(long atm_no,int pin)
	{
		this.atm_no=atm_no;
		this.pin=pin;
		acc_list.put(atm_no,pin);
		
	}
	@Override
	public  boolean check(long atm_no,int pin)
	{
		boolean validate=false;
		if(acc_list.containsKey(atm_no) && acc_list.containsValue(pin))
		{
			validate=true;
		}
		return validate;
	}

	
	
}
