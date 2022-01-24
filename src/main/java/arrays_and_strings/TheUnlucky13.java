package arrays_and_strings;

import java.util.Scanner;

/**
 * @author RandomCatGit
 */

//  99
//  10
//  980
//  9701
//  96030
//  950599
//  9409960
//  93149001
//  922080050
//  127651418
public class TheUnlucky13 {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		do {
			int size = s.nextInt();

			double val = Math.pow(10, size) - ((size - 1) * Math.pow(10, size - 2)) + (2 * ((size - 3) * Math.pow(10, size - 4)) - 1);

			System.out.println((long) val % 1000000009);

			testCase--;
		} while (testCase > 0);
		s.close();
	}

}
