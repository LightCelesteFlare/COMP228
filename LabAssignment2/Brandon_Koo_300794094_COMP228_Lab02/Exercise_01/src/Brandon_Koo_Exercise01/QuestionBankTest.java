package Brandon_Koo_Exercise01;

import java.util.Scanner;

public class QuestionBankTest {
	static int n;
	static Scanner scanner = new Scanner( System.in );
	public static void main(String[] arg)
	{
		n = 1;
		while(n == 1) {
		QuestionBank.simulateQuestion(0);		
		System.out.print( "Type some data for the program: " );
		// Scanner to read a line of text from the user.
		String anwser = scanner.nextLine();		
		// put into the inputanswer
		QuestionBank.inputAnswer(Integer.parseInt(anwser));
		boolean m = QuestionBank.checkAnswer();
		if (m == false)
		{
			n = 0;
		}
		System.out.println("-------------------------------------------------");
		}
		
		n = 2;
		while (n == 2) {
			QuestionBank.simulateQuestion(1);
			System.out.print( "Type some data for the program: " );
			// Scanner to read a line of text from the user.
			int anwser = Integer.parseInt(scanner.nextLine());
			// put into the inputanswer
			QuestionBank.inputAnswer(anwser);
		boolean m = QuestionBank.checkAnswer();
		if (m == false)
		{
			n = 0;
		}
			System.out.println("-------------------------------------------------");
		}
		n = 3;
		while (n == 3) {
			QuestionBank.simulateQuestion(2);
			System.out.print( "Type some data for the program: " );
			// Scanner to read a line of text from the user.
			int anwser = Integer.parseInt(scanner.nextLine());
			// put into the inputanswer
			QuestionBank.inputAnswer(anwser);
		boolean m = QuestionBank.checkAnswer();
		if (m == false)
		{
			n = 0;
		}
			System.out.println("-------------------------------------------------");
		}
		n = 4;
		while (n == 4) {
			QuestionBank.simulateQuestion(3);
			System.out.print( "Type some data for the program: " );
			// Scanner to read a line of text from the user.
			int anwser = Integer.parseInt(scanner.nextLine());
			// put into the inputanswer
			QuestionBank.inputAnswer(anwser);
		boolean m = QuestionBank.checkAnswer();
		if (m == false)
		{
			n = 0;
		}
			System.out.println("-------------------------------------------------");
		}
		
		n = 5;
		while (n == 5) {
			QuestionBank.simulateQuestion(4);
			System.out.print( "Type some data for the program: " );
			// Scanner to read a line of text from the user.
			int anwser = Integer.parseInt(scanner.nextLine());
			// put into the inputanswer
			QuestionBank.inputAnswer(anwser);
			boolean m = QuestionBank.checkAnswer();
			if (m == false)
			{
				n = 0;
			}
			System.out.println("-------------------------------------------------");
		} 
		
	}
}
