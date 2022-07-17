import java.io.*;
import java.util.*;
import java.text.DecimalFormat; 
public class Login extends ATM_Interface
  {
	Scanner input=new Scanner(System.in);
	DecimalFormat money=new DecimalFormat("'$'###,##0.00");
	HashMap <String,Integer> data=new HashMap<String,Integer>();
	ATM_Interface usr=new ATM_Interface();
	String user;
	int pin;
	public int logmeth()
	{
		int x=1;
		do {
			try 
			{
			data.put("Mahesh", 1234);
			data.put("Suresh", 67890);
			System.out.println("WELCOME TO THE  ATM .....");
			System.out.println("Enter the user name..");
			String usr=this.user=input.next();
			System.out.println("Enter your pin..");
			this.pin=input.nextInt();
			}catch(Exception e) {
				System.out.println("invalid pin number..");
				x=2;
			}
			if(data.containsKey(this.user)&& data.get(this.user)==this.pin){
				System.out.println("Valid login.."+" "+"You can now go through your transactions");
				usr.functionalities();
			}else {
				System.out.println("Invalid Login");
			}
	}while(x==1);
	return 0;
	}
}
