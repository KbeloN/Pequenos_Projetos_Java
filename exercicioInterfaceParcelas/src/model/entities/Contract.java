package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer contractNumber;
	private LocalDate contractDate;
	private Double totalValue;
	
	List<Installments> installments = new ArrayList<Installments>();
	
	public Contract(Integer contractNumber, LocalDate contractDate, Double totalValue) {
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.totalValue = totalValue;
	}
	
	public Integer getContractNumber() {
		return contractNumber;
	}
	
	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}
	
	public LocalDate getContractDate() {
		return contractDate;
	}
	
	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}
	
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installments> getInstallments() {
		return installments;
	}
}
