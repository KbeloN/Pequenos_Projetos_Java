package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
	private LocalDate date;
	private Double amount2Pay;
	
	 static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installments() {
	}

	public Installments(LocalDate date, Double amount2Pay) {
		this.date = date;
		this.amount2Pay = amount2Pay;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setExpiryDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount2Pay() {
		return amount2Pay;
	}

	public void setAmount2Pay(Double amount2Pay) {
		this.amount2Pay = amount2Pay;
	}
	
	@Override
	public String toString() {
		return fmt.format(date) + " - R$" + String.format("%.2f", amount2Pay);
	}
	
}
