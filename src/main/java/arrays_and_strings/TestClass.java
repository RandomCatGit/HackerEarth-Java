package arrays_and_strings;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

class TestClass {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(null);
		stack.pop();

		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
	}
}