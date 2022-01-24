package main;

import java.time.LocalDate;
import java.time.Month;

import bankAccount.Account;
import bankAccountException.BankException;

public class StartApp {

	public static void main(String[] args) throws BankException {
		Account account = new Account();
		account.deposit(1000, LocalDate.of(2022, Month.JANUARY,01));
		account.deposit(2000, LocalDate.of(2022, Month.JANUARY,13));
		account.withdraw(500, LocalDate.of(2022, Month.JANUARY,20));
		account.listHistory();
	}
}
