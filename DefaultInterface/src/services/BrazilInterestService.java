package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public Double payment(Double amount, int mounths) {
		if(mounths < 1) {
			throw new InvalidParameterException("Mounths must be greater than zero.");
		}
		return amount * Math.pow(1 + interestRate / 100, mounths);
	}
}
