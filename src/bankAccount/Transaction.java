package bankAccount;

import java.time.LocalDate;

public class Transaction {
	
	private double amount;
	private LocalDate date;
	private double balance;
	private String operation;
	
	public Transaction(double amount, LocalDate date, double balance, String operation) {
		this.amount = amount;
		this.date = date;
		this.balance = balance;
		this.operation = operation;
	}
	
	@Override
    public String toString() {
		return  "Operation: " + operation + 
            		" | Date: " + date +
                    " | amount: " + amount +
                    " | balance: " + balance;
	}
}
