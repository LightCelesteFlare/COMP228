package brandon_koo_exercise02;

import java.security.SecureRandom; // program uses class SecureRandom

public class Lotto {
	SecureRandom randomNumbers = new SecureRandom();
	int[] rolls = new int[3];
	
	// Constructor
	public Lotto(int num) {
	for (int counter = 0; counter < 3; counter++) {
        // pick random integer from 1 to 6    
        rolls[counter] = 1 + randomNumbers.nextInt(9);

        System.out.printf("%d  ", rolls); // display generated value
        
        // if counter is divisible by 5, start a new line of output
        if (counter % 5 == 0) {
           System.out.println();
        	}
		}
	}
}
