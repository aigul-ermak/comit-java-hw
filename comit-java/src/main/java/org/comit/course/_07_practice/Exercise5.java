package org.comit.course._07_practice;

class BankAccount {

	double balance;

	void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
}

class SavingsAccount extends BankAccount {

	@Override
	void withdraw(double amount) {

		if (this.balance - amount < 100) {
			System.out.println("Operation Cancelled - new balance will be below 100");
		} else {
			this.balance = this.balance - amount;
		}
	}
}

public class Exercise5 {
	public static void main(String[] args) {

		SavingsAccount savings = new SavingsAccount();

		savings.deposit(1000);
		savings.withdraw(950);
	}
}
