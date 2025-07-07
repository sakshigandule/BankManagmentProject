package POJO;

import java.time.LocalDate;

public class Transaction {

	private String type;
	private double balance;
	private LocalDate dt;
	
	
	public Transaction () {
		// 0 Param constr
	}
	
	
	public Transaction(String type, double balance, LocalDate dt) {
		super();
		this.type = type;
		this.balance = balance;
		this.dt = dt;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDt() {
		return dt;
	}
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}


	@Override
	public String toString() {
		return "Transaction [type=" + type + ", balance=" + balance + ", dt=" + dt + "]";
	}
	
	
	
	
}
