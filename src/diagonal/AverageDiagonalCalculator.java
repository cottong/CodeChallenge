package diagonal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageDiagonalCalculator {
public static void main(String[] args) {
	
	Scanner scan1 = new Scanner(System.in);
	int[][] numArray = new int [3][3];
	
	int input;
	
	for (int i = 0; i < numArray.length; i++) {
		for (int j= 0; j < numArray.length; j++) {
			System.out.println("Enter a number");
			input = scan1.nextInt();
			scan1.nextLine();
			numArray[i][j] = input;	
		}
	}
	System.out.println("Here is your array");
	for (int i = 0; i < numArray.length; i++) {
		for (int j= 0; j < numArray.length; j++) {
			System.out.print(numArray[i][j] + "\t");
		}System.out.println();
	}
	
	int sum = 0;
for (int i = 0; i < numArray.length; i++) {
	sum = sum + numArray[i][i];
	
}
	double average = (double)sum/numArray.length;
	DecimalFormat df = new DecimalFormat("#.00");
	
	System.out.println("The average of the diagonal is " + df.format(average));
	
	
	
}
}
