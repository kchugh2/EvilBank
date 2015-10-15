package newPackage;

import java.util.Scanner;

public class Account {
	private String name;
	private double accountBalance;
	private long accountNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Account(int s)
	{	
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("Enter the name on the account ");
		setName(keyboard.nextLine());
		System.out.println("Enter Account Number");
		setAccountNumber(keyboard.nextLong());
		System.out.println("Enter the Account Balane");
		setAccountBalance(keyboard.nextDouble());
	}
	
	@Overload	
	public Account()
	{	
		
		setName("");
		
		setAccountNumber(0);
		
		setAccountBalance(0);
	}
	

	
}
