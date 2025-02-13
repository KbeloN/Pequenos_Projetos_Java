package model.services;

public class PayPal implements OnlinePaymentServices{

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer mounth) {
		return amount * (mounth * 0.01) ;
	}
	
}
