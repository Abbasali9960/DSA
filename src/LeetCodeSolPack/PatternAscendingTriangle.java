package LeetCodeSolPack;

public class PatternAscendingTriangle {
    
	public static void triangle(int n)
	{
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*\t");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int n = 10;
		
		PatternAscendingTriangle.triangle(n);
		
	}
	
}	
