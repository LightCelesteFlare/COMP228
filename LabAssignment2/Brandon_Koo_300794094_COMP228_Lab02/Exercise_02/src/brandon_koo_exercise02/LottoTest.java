package brandon_koo_exercise02;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String user;
		
		System.out.printf("Pick a number from 3 - 27 : ");
		user = s.next();
		Lotto.inputAnwser(Integer.parseInt(user));
		Lotto.giveLotto();	
	}

}
