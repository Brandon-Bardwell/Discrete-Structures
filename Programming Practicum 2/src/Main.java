import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		/** Plot sort time vs n */
		/* for n = 10,
		* 100, 1,000, 10,000, 100,000,
		* 1,000,000, 10,000,000 and 100,000,000.
		*/

		// notes: help from:
		//https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
		// and
		// https://www.baeldung.com/java-math-pow
		int arraySize = 1;
		
		long startTime = System.nanoTime();
		
		long endTime = System.nanoTime();
		
		long duration = (endTime - startTime);
		//divide by 1000000 to get milliseconds.
		
		System.out.println("array size, Sort time, Parallel Sort Time ");
		
		for(int zeroCount = 1; zeroCount < 9; zeroCount++)
		{
			
		arraySize = (int)Math.pow(10, (double)zeroCount);
		
		System.out.print(arraySize + ", ");
		
		int[] ourArray = new int[arraySize];
		
		int[] ourSecondArray = new int[arraySize];
		
		fillArray(ourArray);
		
		fillArrayCopy(ourSecondArray, ourArray);
		
		startTime = System.nanoTime();
		
		Arrays.sort(ourArray);
		
		endTime = System.nanoTime();
		
		duration = (endTime - startTime);
		//divide by 1000000 to get milliseconds.
		
		System.out.print(duration + ", ");
		
		startTime = System.nanoTime();
		
		Arrays.parallelSort(ourSecondArray);
		
		endTime = System.nanoTime();
		
		duration = (endTime - startTime); 
		//divide by 1000000 to get milliseconds.
		
		System.out.print(duration + ", ");
		
		System.out.println();
		}
		System.out.println("Thanks for coming to my TED Talk :)");

		}

		private static void fillArrayCopy(int[] ourSecondArray, int[] ourArray) {
		for(int index = 0; index < ourArray.length; index++)
		{
			
		ourSecondArray[index] = ourArray[index];
		}

		}

		private static void fillArray(int[] ourArray) {
		for(int index = 0; index < ourArray.length; index++)
		{
			
		ourArray[index] = (int)(Math.random()*ourArray.length*10);
		}

		}

		

	}


