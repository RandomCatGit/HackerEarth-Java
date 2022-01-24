package arrays_and_strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MonkandNiceStrings {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		List<String> charList = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			String val = s.next();
			charList.add(val);
			System.out.println(charList.stream().filter(ch -> ch.compareTo(val) < 0).count());
		} 
		s.close();
	}
}
