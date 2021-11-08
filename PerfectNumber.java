package Day6LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check if its a perfect number");
		int N = scanner.nextInt();
		
		int i=0;
		int sum=0;
		for(i=1; i<=N/2; i++)
		{
			if(N%i == 0)
			{
				sum=sum+i;
			}
		}
		
		//System.out.println(sum);
		if(sum==N)
		{
			System.out.println("Yes,it is a perfect number");
		}
		else
		{
			System.out.println("No, it is not a perfect number");
		}
	}
}
