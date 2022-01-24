package bankAccount;

import java.time.LocalDate;
import java.util.*;

import bankAccountException.BankException;

public class Account {

	private double currentBalance;
	private List<Transaction> transactions;
	
	public Account() {
		transactions = new ArrayList<Transaction>();
	}
	
	public void deposit(double amount, LocalDate date) {
        currentBalance += amount;
        transactions.add(new Transaction(amount, date, currentBalance, "Credit"));
     }		

	public void withdraw(double amount, LocalDate date) throws BankException {
		if (amount > currentBalance) {
			throw new BankException("Not enough money in the account");
		}
		else {
			currentBalance -= amount;
			transactions.add(new Transaction(-amount,date,currentBalance, "Debit"));
		}
	}

	public void listHistory() {
		Iterator<Transaction> i =transactions.iterator();
		String result="";
		while (i.hasNext()) {
			result = result + i.next().toString() + "\n";
		}
		System.out.print(result);
	}
}
