package Day6LogicalPrograms;

import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many digits should the coupon numbers be");
		int d = scanner.nextInt();
		System.out.println("Enter how many distinct coupon numbers do you need");
		int N = scanner.nextInt();
		
		int Coupons[] = new int[N+1];	
		
		int a=2;
		int i=1;
		while(i<=N)
		{
			double coupon = Math.floor(Math.random()*(Math.pow(10, d)));
			//System.out.println(coupon);
			
			Coupons[i] = (int) coupon;
			for(int j=0; j<i; j++)
			{
				if(Coupons[i] == Coupons[j] && i!=j)
				{
					a=1;
					//System.out.println(Coupons[i] +" Coupon number occurred again");
					break;
				}
				else
				{
					a=0;
				}
			}
			if(a==0)
			{
				System.out.println(Coupons[i]);
				i++;				                  //index increases only if the coupon is unique
			}
		}
	}
}
