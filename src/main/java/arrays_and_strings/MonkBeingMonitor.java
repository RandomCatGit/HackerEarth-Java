package arrays_and_strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MonkBeingMonitor {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();

		while (cases-- > 0) {
			int size = s.nextInt();
			s.nextLine();
			int[] array = getArrayInput(s.nextLine());
			Map<Integer, Integer> heightMap = new HashMap<>();
			for (int height : array) {
				Integer getHeight = heightMap.get(height);
				heightMap.put(height, getHeight == null ? 1 : getHeight + 1);
			}
			int diff = heightMap.values().stream().max(Integer::compare).get() - heightMap.values().stream().min(Integer::compare).get();
			System.out.println(diff);
		}
		s.close();
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}
}
