package monk;

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
			int startPos = countShift[1] % arrayLength;
			if (startPos == 0) {
				printResult(arrayData);
				continue;
			}
			int[] result = new int[arrayLength];
			for (int i = 0; i < arrayLength; i++) {
				result[(i + countShift[1]) % arrayLength] = arrayData[i];
			}
			printResult(result);
			testCase--;
		} while (testCase > 0);
		s.close();
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}

	private static void printResult(int[] array) {
		System.out.println(Arrays.toString(array).replaceAll("\\[|\\]|,", ""));
	}
}
