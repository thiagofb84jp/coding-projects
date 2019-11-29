package br.com.blockone;

public class Account {

	private String id;

	private String name;

	private int balance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return balance = balance + amount;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Amount exceed balance. The value remained.");
		}
		return balance;
	}

	public int transferTo(Account account, int amount) {
		if (amount <= balance) {
			account.credit(amount);
		} else {
			System.out.println("Amount exceed balance.");
		}
		return balance;
	}
}