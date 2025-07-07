package MainClass;

import java.util.Scanner;

import Helper.BankManager;
import POJO.BankAccount;
import POJO.SavingAccount;

public class BankTestRunner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("=====================================");
		System.out.println("Wellcome To My bank Project");
		System.out.println("=====================================");
		System.out.println("1) Create a new Bank Account");
		System.out.println("2) Show All Bank Account ");
		
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			System.out.println("Please enter choice a type of Account 1) Saving 2) Current");
			int type=sc.nextInt();
			if(type==1) {
				BankAccount saving=new SavingAccount("124323456512","Parmeshwar","HYD",2000,505487873343L);
				BankManager bm=new BankManager();
				bm.createAccount(saving);
				break;
			}
			
		}
		case 2: {
			 new BankManager().showAllBankDetails();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}
}
}
