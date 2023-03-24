package Java;
import java.util.Scanner;

public class ATMWorking {
	Scanner sc=new Scanner(System.in);
    int deposit ;
	int withdraw;
	int checkbalance;
	int transaction=0;
	int transfer;
	int amount;
	int total_balance=10000;
	
	int account_num=1002345678;
	int pin=1111;
	boolean login(){
	boolean log=true;
	System.out.println("WELCOME TO ATM");
	System.out.println("Please enter your ATM card");
	int inputacc=sc.nextInt();
	if(inputacc==account_num) {
		System.out.println("Enter the pin");
		int inputpin=sc.nextInt();
		if(inputpin==pin) {
			System.out.println("welcome");
		}
			else {
				System.out.println("Incorrect pin");
				log=false;
			}
		}
		else {
			System.out.println("Incorrect account number");
			log=false;
		}
	
	return log;
	}

	void deposit() {
		System.out.println("Enter the amount to be deposited:");
		deposit=sc.nextInt();
		total_balance=total_balance+deposit;
		System.out.println("total balance is:"+total_balance);
		transaction++;
	}
	void withdraw() {
		System.out.println("Enter the amount to be withdrawn:");
		withdraw=sc.nextInt();
		total_balance=total_balance-withdraw;
		System.out.println("total balance is :"+total_balance);
		transaction++;
	}
	void transfer() {
	    System.out.println("Enter the amount to be transferred:");
		amount=sc.nextInt();
		System.out.println("add account number of recepient:");
		int accrec=sc.nextInt();
		total_balance-=amount;
		System.out.println("amount transferred successfully"+'\n'+"total available balance:"+total_balance);
		transaction++;
	}
	void transaction() {
		System.out.println("Transaction history of your account is:");
		System.out.println(transaction);
	}
	void quit() {
		System.out.println("..Thankyou..");
	}
	
public static void main(String[] args) {
	ATMWorking obj=new ATMWorking();
	Scanner sc=new Scanner(System.in);
	int account_num=1002345678;
	int pin=1111;
	
			boolean isvalid=obj.login();
			if(isvalid) {
			boolean flag=false;	
			while(!flag) {
			System.out.println("Enter your choice: \n"+"1.deposit \n"+"2.withdraw \n"+"3.transfer \n"+"4.transaction \n"+"5.Quit \n");
			int choice=sc.nextInt();
			switch(choice) {
			 
			case 1:
				obj.deposit();
				break;
			case 2:
				obj.withdraw();
				break;
			case 3:
				obj.transfer();
				break;
			case 4:
				obj.transaction();
				break;
			case 5:
			    flag=true;
				obj.quit();
				break;
			}
	   	}
	}
		}
}