import java.io.*;
import java.util.*;
import java.sql.Timestamp;
	public class ATM_Interface {
		Scanner input=new Scanner(System.in);
		Timestamp ctime=new Timestamp(System.currentTimeMillis());
		String user;
		int balance=0;
		String str;
		public void functionalities()
		{
			System.out.println("Select your option");
			System.out.println("1.Withdraw cash ");
			System.out.println("2.Deposit money");
			System.out.println("3.Transfer money");
			System.out.println("4.Balance Enquiry");
			System.out.println("5.Exit");
			System.out.println("Enter your option ");
			int choice=input.nextInt();
			ATM_Interface usr=new ATM_Interface();
			switch(choice) 
			{
			case 1:
				balance=usr.withdraw(balance);
				break;
			case 2:
				balance=usr.deposit(balance);
				break;
			case 3:
				balance=usr.transfer(balance);
				break;
			case 4:
				balance=usr.balance(balance);
				break;
			case 5:
				usr.quit();
				break;
			default:
				System.out.println("Invalid choice!..Enter the valid option ");
				functionalities();
			}
		}
		public int withdraw(int b)
		{
			balance=b;
			System.out.println("Enter the money you would like to withdraw");
			int wd=input.nextInt();
			try {
			if(wd>balance) {
				System.out.println("You have insufficient balance ");
				System.out.println("unable to withdraw money");
			}
			else if(wd<=balance) {
				balance=balance-wd;
				System.out.println("Withdraw successful at "+ctime);
			}
			}
			catch(Exception e) {
				
			}
			functionalities();
			return balance;
		}
		public int deposit(int b) {
			balance=b;
			System.out.println("Enter the amount you want to deposit money");
			int dpt=input.nextInt();
			try {
			if(dpt<100000) {
			balance=balance+dpt;
			System.out.println("Deposit Sucessfull at "+ctime );
			System.out.println("Now Your current balance is"+balance);
			}
			else {
				System.out.println("Cannot deposit more than 1 lakh");
			}
			}
			catch(Exception e) {
				
			}
			functionalities();
			return balance;
		}
		public int transfer(int b) {
			balance=b;
			String to_acc;
			int tamount;
			System.out.println("Enter the user you want to transfer amount");
			to_acc=input.next();
			System.out.println("Enter the amount to transfer");
			tamount=input.nextInt();
			try {
			balance=balance-tamount;
			System.out.println("Transaction successful");
			}
			catch(Exception e) {
				
			}
			functionalities();
			return balance;
		}
		public int balance(int b) {
			balance=b;
			System.out.println("Your current balance is"+balance);
			functionalities();
			return balance;
		}
		public void quit() {
			System.out.println("Thank you...");
		}
	}
	
	
