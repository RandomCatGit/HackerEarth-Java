package arrays_and_strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MonkAndRotation {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		s.nextLine();
		do {
			int[] countShift = getArrayInput(s.nextLine());
			int[] arrayData = getArrayInput(s.nextLine());

			int arrayLength = countShift[0];
			int startPos = arrayLength - (countShift[1] % arrayLength);
			StringBuilder sb = new StringBuilder();
			for (int i = startPos; i < arrayLength; i++) {
				//result[(i + countShift[1]) % arrayLength] = arrayData[i];
				sb.append(arrayData[i]);
				sb.append(" ");
			}
			for (int i = 0; i < startPos; i++) {
				//result[(i + countShift[1]) % arrayLength] = arrayData[i];
				sb.append(arrayData[i]);
				sb.append(" ");
			}
			testCase--;
			System.out.println(sb.toString());
		} while (testCase > 0);
		s.close();
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}
}
