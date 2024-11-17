package com.program.java.oops.part2;

public class InterfaceSample implements DebitCard,CreditCard {

	@Override
	public void cardName() {

		System.out.println("ICICI debit card");

	}

	@Override
	public void balanceCheck() {

		System.out.println("Visit : icici.com");

	}

	public static void main(String[] args) {

		InterfaceSample ob = new InterfaceSample();

		ob.cardName();
		ob.balanceCheck();

	}

	@Override
	public void creditPoints() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkCreditCardBalace() {
		// TODO Auto-generated method stub
		
	}

}
