package Iteration6_testing;

import Iteration6.Interface_Payment;

public class Payment_Management implements Interface_Payment{

	public void generateBill() {
		
		System.out.println("Generate bill");
	}
	
	public void cancelBill() {
		System.out.println("Bill canceled");
	}
	
	
}
