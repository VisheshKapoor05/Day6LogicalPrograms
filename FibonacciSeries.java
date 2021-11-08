package Day6LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of values to get fibonacci series");
		int N = scanner.nextInt();
		
		int f=0;
		int f1=0;
		int f2=1;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0; i<N-2; i++)
		{
			f=f2;
			f2=f2+f1;
			f1=f;
			System.err.println(f2);			
		}
	}
}
