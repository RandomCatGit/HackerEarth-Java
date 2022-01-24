package arrays_and_strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MonkandSortingAlgorithm {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.nextLine();
		long[] array = getArrayInput(s.nextLine());
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		int pass = 0;
		while (true) {
			pq.clear();
			long[] temp = Arrays.copyOf(array, array.length);
			int val;
			boolean isZero = true;
			for (int i = 0; i < size; i++) {
				val = (int) (temp[i] % Math.pow(10, 5 * (pass + 1)) / Math.pow(10, 5 * pass));
				pq.add(new int[] {
						val, i });
				if (isZero && val != 0)
					isZero = false;
			}
			if (isZero) {
				break;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < size; i++) {
				int[] data = pq.poll();
//				System.out.print(temp[data[1]]);
				sb.append(temp[data[1]]);
//				System.out.print(" ");
				sb.append(" ");
				array[i] = temp[data[1]];
			}
			System.out.println(sb.toString());

			pass++;
		}

		s.close();
	}

	private static long[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToLong(Long::parseLong).toArray();
	}
}
