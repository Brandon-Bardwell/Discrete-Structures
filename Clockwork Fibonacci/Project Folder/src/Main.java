import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		//Write a program that finds the first 40 Fibonacci numbers.
		ArrayList<Integer> fibNumbers = new ArrayList<>();
		fibNumbers.add(0);
		//System.out.println(fibNumbers.get(fibNumbers.size() - 1));
		fibNumbers.add(1);
		//System.out.println(fibNumbers.get(fibNumbers.size() - 1));
		populateFibNumbers(fibNumbers);

		//List all numbers evenly divisible by 5.
		int DivisibleBy = 5;
		System.out.println("Divisble by :" + DivisibleBy);
		printFibNumbersDivisibleBy(fibNumbers,DivisibleBy);


		//List all numbers evenly divisible by 7.
		DivisibleBy = 7;
		System.out.println("Divisble by :" + DivisibleBy);
		printFibNumbersDivisibleBy(fibNumbers,DivisibleBy);

		//List all numbers evenly divisible by 5 and 7.
		System.out.println("Divisble by 5 and 7:");
		printFibNumbersDivisibleByFiveAndSeven(fibNumbers);

		}

		private static void printFibNumbersDivisibleByFiveAndSeven(ArrayList<Integer> fibNumbers) {
		for(int index = 0; index < fibNumbers.size(); index++)
		{
		if(fibNumbers.get(index) % 5 == 0 && fibNumbers.get(index) % 7 == 0 )
		{
		System.out.print(fibNumbers.get(index) + ", ");
		}
		}
		}

		private static void printFibNumbersDivisibleBy(ArrayList<Integer> fibNumbers, int DivisbleBy) {
		for(int index = 0; index < fibNumbers.size(); index++)
		{
		if(fibNumbers.get(index) % DivisbleBy == 0)
		{
		System.out.print(fibNumbers.get(index) + ", ");
		}
		}
		}

		private static void populateFibNumbers(ArrayList<Integer> fibNumbers) {
		int fibFounCount = 2;
		int fibHuntLimit = 41;

		while(fibHuntLimit > fibFounCount)
		{
		fibNumbers.add(fibNumbers.get(fibNumbers.size() - 1) + fibNumbers.get(fibNumbers.size() - 2) );
		//System.out.println(fibNumbers.get(fibNumbers.size() - 1));
		fibFounCount++;
		}

		}

		

	}


