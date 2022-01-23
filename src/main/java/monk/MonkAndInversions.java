package monk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RandomCatGit
 */
public class MonkAndInversions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		s.nextLine();
		do {
			int matrixSize = s.nextInt();
			int[][] matrixData = getMatrixInput(s, matrixSize);
			printInversion(matrixData, matrixSize);
			testCase--;
		} while (testCase > 0);
		s.close();
	}

	private static int[] getArrayInput(String inputString) {
		return Arrays.asList(inputString.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	}

	private static int[][] getMatrixInput(Scanner scanner, int size) {
		int[][] result = new int[size][size];
		scanner.nextLine();
		for (int i = 0; i < size; i++) {
			result[i] = getArrayInput(scanner.nextLine());
		}
		return result;
	}

	private static void printInversion(int[][] matrix, int matrixSize) {
		int inversions = 0;
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				inversions += checkInversion(matrix, matrixSize, i, j);
			}
		}
		System.out.println(inversions);
	}

	private static int checkInversion(int[][] matrix, int matrixSize, int p, int q) {
		int inversions = 0;
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				if (i <= p && j <= q && matrix[i][j] > matrix[p][q]) {
					inversions++;
				}
			}
		}
		return inversions;
	}

}
