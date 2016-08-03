package diagonal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageDiagonalCalculator {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the size of the square");
		int arraySize = scan1.nextInt();
		scan1.nextLine();
		int[][] numArray = new int[arraySize][arraySize];

		grabsArrayNumbers(scan1, numArray);
		System.out.println("Here is your array");
		printArray(numArray);
		
		DecimalFormat df = new DecimalFormat("#.00");
		double average = avgArray(numArray);

		System.out.println("The average of the diagonal is "
				+ df.format(average));
	}

	private static void grabsArrayNumbers(Scanner scan1, int[][] numArray) {
		int input;

		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length; j++) {
				System.out.println("Enter a number");
				input = scan1.nextInt();
				scan1.nextLine();
				numArray[i][j] = input;
			}
		}
	}

	private static void printArray(int[][] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray.length; j++) {
				System.out.print(numArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static double avgArray(int[][] numArray) {
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i][i];

		}
		double average = (double) sum / numArray.length;
		return average;
	}
}
