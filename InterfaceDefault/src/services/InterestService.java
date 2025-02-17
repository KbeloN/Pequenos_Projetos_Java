package services;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterestRate();
	
	default Double payment(Double amount, int mounths) {
		if(mounths < 1) {
			throw new InvalidParameterException("Mounths must be greater than zero.");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, mounths);
	}
}
