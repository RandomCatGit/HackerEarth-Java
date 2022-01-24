package arrays_and_strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author RandomCatGit
 */
public class MonkandSuffixSort {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String string = s.next();
		int k = s.nextInt();
		int size = string.length();

		String[] array = new String[size];
		for (int i = 0; i < size; i++) {
			array[i] = string.substring(i, size);
		}
		array = Arrays.stream(array).sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList()).toArray(new String[0]);

		System.out.println(array[k - 1]);
		s.close();
	}
}
