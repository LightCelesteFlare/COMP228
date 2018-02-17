import static org.junit.Assert.*;

import org.junit.Test;

public class BasePlusCommissionEmployeeTest {

	@Test
	public void test() {
		BasePlusCommissionEmployee test1 = 
				new BasePlusCommissionEmployee(29, "Brandon", "Koo", 0, 30, 0.2);
		
		BasePlusCommissionEmployee test2 = 
				new BasePlusCommissionEmployee(60, "John", "Smith", 400);
		
		// print test1
		System.out.println(test1.toString());
		test1.toString();
		System.out.println(test1.DoubleEarning());
			
		// print test2
		System.out.println(test2.toString());
		test2.toString();
		System.out.println(test2.DoubleEarning());

	}

}
