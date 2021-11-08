package Day6LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a prime number");
		int N = scanner.nextInt();
		
		int i;
		int a=0;
		for (i=2; i<= (N+1)/2; i++ )
		{
		  if ((N%i) == 0)
		  {
		      System.out.println("it is not a prime no.");
		      a=0;
		      break;
		  }
		  else
		  {
			  a=1;
		  }
		}
		
		
		if (a == 1)
		{
			System.out.println("Its a prime no.");
		}

	}

}
