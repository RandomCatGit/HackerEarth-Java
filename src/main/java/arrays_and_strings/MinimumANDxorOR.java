package arrays_and_strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MinimumANDxorOR {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		s.nextLine();
		do {
			int size = s.nextInt();
			s.nextLine();
			int[] arrayData = getArrayInput(s.nextLine());

			Arrays.sort(arrayData);

			int minValue = Integer.MAX_VALUE;
			for (int i = 1; i < size; i++) {
				minValue = Math.min(minValue, (arrayData[i - 1] ^ arrayData[i]));
			}
			System.out.println(minValue);

			testCase--;
		} while (testCase > 0);
		s.close();
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}

}
