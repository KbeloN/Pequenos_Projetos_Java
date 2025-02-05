package model.entities;

public class Fisica extends Pessoa{
	private Double healthExpen;

	public Fisica(String nome, Double anualIncome, Double healthExpen) {
		super(nome, anualIncome);
		this.healthExpen = healthExpen;
	}

	public Double getHealthExpen() {
		return healthExpen;
	}

	public void setHealthExpen(Double healthExpen) {
		this.healthExpen = healthExpen;
	}
	
	@Override
	public Double tax() {
		if(anualIncome >= 20000.0) {
			return (anualIncome * 0.25) - (healthExpen * 0.50);
		}else {
			return (anualIncome * 0.15) - (healthExpen * 0.50);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getNome() + ", Anual Income: " + getAnualIncome() + ", Health expenditures: " + getHealthExpen() + ", Total tax to pay: " + String.format("%.2f", tax()));
		return sb.toString();
	}
	
}
