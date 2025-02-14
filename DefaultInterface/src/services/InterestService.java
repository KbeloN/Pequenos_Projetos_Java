package services;

public interface InterestService {
	Double getInterestRate();
	Double payment(Double amount, int mounths);
}
