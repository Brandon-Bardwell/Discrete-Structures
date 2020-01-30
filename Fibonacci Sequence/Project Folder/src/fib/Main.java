package fib;

public class Main {

	public static void main(String[] args) {
	
		int[] bunnyCountPerMonth = new int[10];
		bunnyCountPerMonth[0] = 0;
		bunnyCountPerMonth[1] = 1;
		for(int monthIndex = 2; monthIndex < bunnyCountPerMonth.length; monthIndex ++)
		{
		bunnyCountPerMonth[monthIndex] = bunnyCountPerMonth[monthIndex-1] + bunnyCountPerMonth[monthIndex-2];
		}
		System.out.println("For month 3, we had " + bunnyCountPerMonth[3-1] + " bunnies." );
		System.out.println("For month 5, we had " + bunnyCountPerMonth[5-1] + " bunnies." );
		System.out.println("For month 10, we had " + bunnyCountPerMonth[10-1] + " bunnies." );
		}
		}