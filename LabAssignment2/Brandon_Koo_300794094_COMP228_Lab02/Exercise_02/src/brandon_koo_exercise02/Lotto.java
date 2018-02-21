package brandon_koo_exercise02;

import java.security.SecureRandom; // program uses class SecureRandom
import java.util.Scanner;

public class Lotto {
	private static final SecureRandom randomNumbers = new SecureRandom();
	static int[] rolls = new int[5];
	static int Number;
	static int counter;
	static int n = 0;
	static int m = 0;
	
	// Constructor
	public static void giveLotto() {
	if (counter < rolls.length) {
        // pick random integer from 1 to 6    
        rolls[counter] = (1 + randomNumbers.nextInt(9)) + (1 + randomNumbers.nextInt(9)) + (1 + randomNumbers.nextInt(9));
        System.out.printf(java.util.Arrays.toString(rolls)); // display generated value
        counter = counter + 1;
        MatchChecking();
		}
	}
	
	// Check if user number matches the Lotto numbers
	public static void MatchChecking()
	{
		// start the while loop
		while (n < 5)
		{
			System.out.println("\nTry: " + (1 + m)); // this will show current number of tries
			// this will check the current roll with the user input
			if (rolls[m] == Number)
			{
				System.out.println("Player wins");
				n = 5; // to break out of the while loop
				break; 
			}
			if (n == 4)
			{
				System.out.println("Computer Wins");
				n = 5; // to break out of the while loop
				break; 
			}
			else {
		
				System.out.printf(": ");
				Scanner s = new Scanner(System.in);
				String user = s.next();
				inputAnwser(Integer.parseInt(user));
				
				n++;	// increase the number by 1;
				m++;	// increase the number by 1;
				giveLotto(); // get another random number
			}
			
		}
		

	}
	
	// user input a number 3 - 27
	public static void inputAnwser(int user)
	{
			// checks if the input is the range from 3 to 27
			if (user > 2 && user < 28 )
			{
			Lotto.Number = user;
			}
			else
			{
				System.out.println("input is invalid");
				System.out.printf(": ");
				Scanner s = new Scanner(System.in); 
				String User = s.next();
				inputAnwser(Integer.parseInt(User)); // this will loop until the user puts a number from 3 to 27
			}
	}
	
	
	//rolls[0], rolls[1], rolls[2], rolls[3], rolls[4]
}
