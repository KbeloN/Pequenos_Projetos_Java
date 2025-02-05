package model.entities;

public class Juridica extends Pessoa {
	private Integer employees;

	public Juridica(String nome, Double anualIncome, Integer employees) {
		super(nome, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
	
	@Override
	public Double tax() {
		if(employees > 10) {
			return anualIncome * 0.14;
		}else {
			return anualIncome * 0.16;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getNome() + ", Anual Income: " + getAnualIncome() + ", Employees: " + getEmployees() + ", Total tax to pay: " + String.format("%.2f", tax()));
		return sb.toString();
	}
}
