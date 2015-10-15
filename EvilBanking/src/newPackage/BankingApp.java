package newPackage;
import java.util.*;

import newPackage.Account;
import newPackage.Transaction;
import newPackage.TransactionHistory;
import newPackage.TransactionProcessor;
public class BankingApp {
	Scanner keyboard = new Scanner(System.in);
	/*static HashMap < Long, ArrayList<Transaction>> transmap = new HashMap<Long, ArrayList<Transaction>>();
	public void transactionHistoryStorer(Account A, Transaction T)
	{
		
	}*/
	
	

		


public static void main(String[] args)
{
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner keyboard = new Scanner(System.in);
	Transaction[] allTransactions = new Transaction[10];
	ArrayList<TransactionHistory> history = new ArrayList<TransactionHistory>();
	int accEscape = 1,tEscape=1,alltEscape=1,transactionCounter=0;
	int i =0;
	
	do
	{
		System.out.println("Create new account");
		Account a = new Account(2); 
		accounts.add(a);
		System.out.println("Press 1 to add more Accounts ! \nPress 0 to if done adding accounts");
		accEscape = keyboard.nextInt();
		
	}while(accEscape!=0);
	
	do
	{
		
		int accountIndex=-1;
		do
		{
			System.out.println("Enter the account number associated with the Transactions to be entered");
			long accnumber = keyboard.nextLong();
			for(int j = 0; j< accounts.size(); j++)
			{
			Account finder = accounts.get(j);
			if(finder.getAccountNumber()==accnumber)
				accountIndex=j;
			}
		if (accountIndex==-1)
		System.out.println("Account not found! Try again!");
		}while(accountIndex == -1);
		
		do
		{
			System.out.println("Enter Transaction no  " + (i+1) + " MAX TEN!");
			Transaction transact = new Transaction();
			allTransactions[i]=transact;
			
			
			TransactionHistory temp = new TransactionHistory(accounts.get(accountIndex),allTransactions[i]);
			history.add(temp);
			
			System.out.println("Press 1 to add more transactions to this account ! \nPress 0 to if done adding transactions");
			tEscape = keyboard.nextInt();
			transactionCounter++;
			
			i++;
		}while(tEscape!=0&&i<10);
	
		
	//Account transactionProces = new Account();
	TransactionProcessor transactionProcess = new TransactionProcessor(accounts.get(accountIndex),allTransactions,transactionCounter);
	accounts.remove(accountIndex);
	accounts.add(transactionProcess.getReturnAccount());
		
	System.out.println("Press 1 to enter Transactions for a different account and 0 to Exit");
	alltEscape = keyboard.nextInt();
	}while(alltEscape!=0);
	
	System.out.println("Transaction History");

	TransactionHistory H;
	Account A;
	Transaction T;
	
	for(int i1 = 0; i1<history.size(); i1++)
	{
		H=history.get(i1);
		A=H.getAcc();
		T=H.getTrans();
		System.out.println(T.getChoicetype());
		System.out.println("\nAcc no: "+A.getAccountNumber()+"Transaction amount "+T.getAmount()+"Transaction Type "+T.getChoicetype());
	
	}


}
}
