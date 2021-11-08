package Day6LogicalPrograms;

//import java.time.LocalDateTime;
import java.util.Scanner;

public class StopWatchProg {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type 1 to start the stopwatch");
		int s = scanner.nextInt();
		long start = 0;
		if(s==1)
		{
			//LocalDateTime StartTime = LocalDateTime.now();
			start = System.nanoTime();
			System.out.println(start);
		}
		
		System.out.println("Please type 0 to stop the stopwatch");
		s = scanner.nextInt();
		if(s==0)
		{
			//LocalDateTime EndTime = LocalDateTime.now();
			long end = System.nanoTime();
			System.out.println(end);
			long timeElapsed = end - start ;
			System.out.println("Elapsed time: " +timeElapsed/1000000000 +" seconds");
		}
		
		
		
		
	}
}
