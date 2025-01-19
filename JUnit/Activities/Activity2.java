import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Activity2 {

	@Test
	public void notEnoughFunds()
	{
		BankAccount BA= new BankAccount(9);
		 assertThrows(NotEnoughFundsException.class, () -> BA.withdraw(10),
	                "Balance must be greater than amount of withdrawal");
	}
	@Test
	public void enoughFunds()
	{
		  // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
	}
}
