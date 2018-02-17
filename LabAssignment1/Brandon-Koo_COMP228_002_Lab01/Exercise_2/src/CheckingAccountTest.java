import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingAccountTest {

	@Test
	public void test() {
		CheckingAccount test1 = new CheckingAccount(123, "Smith", 150);
		
		// balance below 50 
		CheckingAccount test2 = new CheckingAccount(52, "Brandon", 200);
		
		// print 2est1
		System.out.println(test1.toString());
		System.out.println(test1.withdraw(40));
		// balance should change
		System.out.println("new balance:" + test1.getAccountBalance());
		
		System.out.println("-------");
		// print test2
		System.out.println(test2.toString());
		// 250 is greater than the balance therefore should cancel withdraw 
		System.out.println(test2.withdraw(250));
		// balance should not change
		System.out.println("new balance:" + test2.getAccountBalance());
		
		System.out.println("-------");
		// Withdraw makes the balance below 50 therefore not change
		System.out.println(test2.withdraw(160));
		// balance should not change
		System.out.println("new balance:" + test2.getAccountBalance());
	}
}