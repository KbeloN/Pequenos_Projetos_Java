package model.entities;

public abstract class Pessoa {
	private String nome;
	protected Double anualIncome;
	
	public Pessoa(String nome, Double anualIncome) {
		this.nome = nome;
		this.anualIncome = anualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
	
	public abstract String toString();
}
