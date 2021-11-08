package Day6LogicalPrograms;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
		int N = scanner.nextInt();
		
		int ReversedNo=0;
		int remainder=0;
		while(N>0)
		{
			remainder=N%10;
			ReversedNo=ReversedNo*10+remainder;
			N=N/10;
		}
		System.out.println("Reversed number: " +ReversedNo);
	}

}
