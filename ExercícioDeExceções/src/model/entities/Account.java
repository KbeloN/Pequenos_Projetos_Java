package model.entities;

import model.exceptions.BalanceException;

public class Account {
	private Integer number;
	private String name;
	private Double balance;
	private Double withLimit;

	
	public Account(Integer number, String name, Double balance, Double withLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withLimit = withLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithLimit() {
		return withLimit;
	}
	
	public void withdraw(Double amount) throws BalanceException{
		if(balance < amount) {
			throw new BalanceException("Insuficient funds.");
		}
		if(amount > withLimit) {
			throw new BalanceException("This amount pass your withdraw limit.");
		}
		balance -= amount;
		System.out.println("New balance: $" + String.format("%.2f", balance));
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
}
