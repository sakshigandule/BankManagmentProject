package POJO;

public abstract class BankAccount {

	private String accNo;
	private String name;
	private String address;
	private double balance;
	private long adharNO;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String accNo, String name, String address, double balance, long adharNO) {
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.adharNO = adharNO;
	}
	
	
	public abstract void calculateIntrest();
	
	public abstract void  deposit(double amount);

	public abstract void withdraw(double amount);
	
	

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAdharNO() {
		return adharNO;
	}

	public void setAdharNO(long adharNO) {
		this.adharNO = adharNO;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", address=" + address + ", balance=" + balance
				+ ", adharNO=" + adharNO + "]";
	}

	

	
	
}
