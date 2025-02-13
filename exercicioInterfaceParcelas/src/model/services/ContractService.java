package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {
	private OnlinePaymentServices onlinePaymentServices;

	public ContractService(OnlinePaymentServices paymentServices) {
		this.onlinePaymentServices = paymentServices;
	}
	
	public void processInstallments(Contract ctr, Integer installments) {
		Double basicAmount = ctr.getTotalValue() / installments;
		
		for(int x = 1 ; x <= installments ; x++) {
			LocalDate plus1mounth = ctr.getContractDate().plusMonths(x);
			
			Double interest = onlinePaymentServices.interest(basicAmount, x);
			Double paymentFee = onlinePaymentServices.paymentFee(basicAmount + interest);
			Double amount2pay = basicAmount + interest + paymentFee;
			
			ctr.getInstallments().add(new Installments(plus1mounth, amount2pay));
		}
	}
}
