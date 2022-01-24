package arrays_and_strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class CyclicShift {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		s.nextLine();
		do {
			int[] countShift = getArrayInput(s.nextLine());
			String binaryString = s.nextLine();

			LinkedList<Character> binaryList = new LinkedList<>();
			LinkedList<Character> tempList = new LinkedList<>();
			for (char c : binaryString.toCharArray()) {
				binaryList.add(c);
			}

			int size = countShift[0], offset = 0, frequency = -1;

			for (int i = 0; i < size; i++) {
				if (bitCompare(tempList, binaryList) < 0) { // found bigger number
					tempList = new LinkedList<>(binaryList);
					offset = i;
				} else if (bitCompare(tempList, binaryList) == 0) { // found same pattern again
					frequency = i - offset;
					break;
				}
				binaryList.add(binaryList.removeFirst());
			}

			if (frequency == -1) { // given binary is the biggest
				System.out.println(offset + (countShift[1] - 1l) * size);
			} else {
				System.out.println(offset + ((countShift[1] - 1l) * frequency));
			}

			testCase--;
		} while (testCase > 0);
		s.close();
	}

	private static int bitCompare(LinkedList<Character> firstList, LinkedList<Character> secondList) {
		if (firstList.size() == 0) {
			return -1;
		}
		Iterator<Character> i = firstList.iterator();
		Iterator<Character> j = secondList.iterator();
		while (i.hasNext()) {
			char c = i.next();
			char d = j.next();
			if (c < d) {
				return -1;
			} else if (c > d) {
				return 1;
			}
		}
		return 0;
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}

}
