import java.util.Scanner;

/**
 * This class calls methods that perform exercises 7.8 and 7.15
 * @author Darryl Karney
 * @version CIS2571-001, 26Jun2018
 */
public class Homework5 {

	public static void main(String[] args) {
		//Call method for 7.8
		//averageAnArray();
		
		//Call method for 7.15
		eliminateDuplicatesHeader();
	}
	
	/**
	 * Exercise 7.8 - Returns the average of 10 doubles entered by user
	 */
	public static void averageAnArray() {
		//Declare variables
		Scanner scanner = new Scanner(System.in);
		double[] input = new double[10];
		double result;
		
		//Get user input
		System.out.println("Enter 10 double values: ");
		for(int i = 0; i < 10; i++) {
			input[i] = scanner.nextDouble();
		}
		
		//Retrieve result
		result = average(input);
		
		//Display output
		System.out.println("The average number is: " + result);
	}
	
	/**
	 * 
	 * @param array
	 * @return returns the average as an int
	 */
	public static int average(int[] array) {
		//Declare variables
		double result = 0;
		
		//Calculate result
		for(int i = 0; i < 10; i++) {
			result += array[i];
		}
		
		return Integer.parseInt(String.valueOf(result / 10));
		//Return result
	}
	
	/**
	 * 
	 * @param array
	 * @return returns the average as a double
	 */
	public static double average(double[] array) {
		//Declare variables
		double result = 0;
		
		//Calculate result
		for(int i = 0; i < 10; i++) {
			result += array[i];
		}
		
		return result / 10;
		//Return result
	}
	
	/**
	 * Exercise 7.15 - Returns the distinct ints from a list the user inputs
	 */
	public static void eliminateDuplicatesHeader() {
		//Declare variables
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[10];
		int[] result;
		
		//Get user input
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			input[i] = scanner.nextInt();
		}
		
		//Retrieve result
		result = eliminateDuplicates(input);
		
		//Display output
		System.out.print("The distinct numbers are: ");
		
		for(int i = 0; i < 10; i++) {
			if (result[i] != -1) {
				System.out.print(result[i] + " ");
			}
		}
	}
	
	/**
	 * 
	 * @param list
	 * @return returns a list of distinct numbers from the input
	 */
	public static int[] eliminateDuplicates(int[] list) {
		//Declare variables
		int[] numbers = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int numbersIndex = 0;
		
		//Pop out duplicates
		for(int outer = 0; outer < 10; outer++) { //list array
			boolean isValid = true;
			for(int inner = 0; inner < 10; inner++) { //numbers array
				if (list[outer] == numbers[inner]) {
					isValid = false;
				}
			}
			
			if (isValid) {
				numbers[numbersIndex] = list[outer];
				numbersIndex++;
			}
		}
		
		return numbers;
	}

}
