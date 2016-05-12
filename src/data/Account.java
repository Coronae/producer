package data;

import java.util.List;

public class Account {

	private String IBAN;
	private double balance;
	private String accountCurrency;
	private List<Transaction> ListT;

	public Account(){
		
	}
	
	public Account(String iBAN, double balance, String accountCurrency) {
		super();
		IBAN = iBAN;
		this.balance = balance;
		this.accountCurrency = accountCurrency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public List<Transaction> getListT() {
		return ListT;
	}

	public void setListT(List<Transaction> listT) {
		ListT = listT;
	}

	@Override
	public String toString() {
		return "Account [IBAN=" + IBAN + ", balance=" + balance + ", accountCurrency=" + accountCurrency + "]";
	}

}
