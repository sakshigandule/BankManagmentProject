package Helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import POJO.BankAccount;
import POJO.Transaction;

public class BankManager {

	public static Map<String, BankAccount> account=new HashMap<String, BankAccount>();;
	
	Map<String, List<Transaction>> transaction;
	
	public void createAccount(BankAccount acc) {
		
		if (ValidationUtils.isValidAdharNumber(acc.getAdharNO()))
		{
			
			if (ValidationUtils.isValidAmmount(acc.getBalance()))
			{
				account.put(acc.getName(), acc);
				System.out.println("Account Created Successfully......");
				System.out.println(account);
			}
		}	
	}

	public void showAllBankDetails() {
		//account.forEach(System.out::println);
		System.out.println(account);
	}
	
	
	public void deposit(String accNo, double amount) {
		
	}

	public void withdraw(String accNo, double amount) {
		
	}

	public double getBalance(String accNo) {
		
		return 0;
	}

	public void printMiniStatement(String accNo) {
		
	}

	

	
	
}
