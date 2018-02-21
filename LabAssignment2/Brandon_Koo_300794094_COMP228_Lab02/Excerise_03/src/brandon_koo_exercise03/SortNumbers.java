package brandon_koo_exercise03;

import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {

	public static void Sortnum(int[] a)
	{
		int[] numArray = a;		
		
		// sort the array from lowest to greatest
        Arrays.sort(numArray);
        
        // sorting int[] array in descending order
        for (int i = numArray.length-1; i > -1 ; i--)
            System.out.println(numArray[i]);

	}
}
