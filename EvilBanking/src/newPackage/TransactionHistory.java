package newPackage;
import java.util.*;
import newPackage.Account;
import newPackage.Transaction;

public class TransactionHistory {

	private Account acc;
	private Transaction trans;
	
	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

public TransactionHistory(Account A, Transaction T)
{
	this.setAcc(A);
	this.setTrans(T);
}



}
