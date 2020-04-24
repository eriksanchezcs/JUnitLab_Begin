package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiftCardTest 
{

	@Test
	public void getIssuingStore()
	{
		double		balance;
		GiftCard	card;
		int			issuingStore;
		
		issuingStore	= 1337;
		balance			= 100.00;
		card	= new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()",
				issuingStore, card.getIssuingStore());
		
	}
	
	@Test
	public void getBalance()
	{
		double		balance;
		GiftCard	card;
		int			issuingStore;
		
		issuingStore	= 1337;
		balance			= 100.00;
		card	= new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()",
				balance, card.getBalance(), 0.001);
		
	}
	
	@Test
	public void deduct()
	{
		double		balance;
		GiftCard	card;
		int			issuingStore;
		double		deduct;
		
		deduct			= 1.00;
		issuingStore	= 1337;
		balance			= 100.00;
		card	= new GiftCard(issuingStore, balance);
		
		assertEquals("deduct()",
				"Remaining Balance: " + (String.format("%6.2f",
                        Math.abs(balance) - deduct)), card.deduct(deduct));
	}

}
