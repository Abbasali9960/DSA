package LeetCodeSolPack;

public class printFabonacciSeries {
	
	
	public static void printFabonacii(long n)
	{
		long a=0;
		long b =1;
		long c =0;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
			
	}
	
	
	public static void main(String[] args)
	{
		int n = 10;
		printFabonacciSeries.printFabonacii(1000);
	//	PatternAscendingTriangle.triangle(n);
		
	}

}
