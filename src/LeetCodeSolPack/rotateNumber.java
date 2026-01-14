package LeetCodeSolPack;

import java.io.Console;

public class rotateNumber {
	
	public static void rotateNo(int no, int count)
    {
		int temp = no;
		int nod =0;
		//Number of digit
		while(temp>0)
		{
			temp = temp/10;
			nod++;
		}
		count = count%nod;
		//for negative value for reverse rotation 
		if(count<0)
		{
			count = count + nod;
		}
		
		int div =1;
		int multi = 1;
		
		for(int i =1 ;i<=nod;i++)
		{
			if(i<=count)
			{
				div = div*10;
			}
			else
			{
				multi = multi*10;
			}
		}
		
		int rem = no%div;
		int quo = no/div;
		int res =0;
		res = rem*multi + quo;	
		
		System.out.println("Value is : "+res);
	
		
	}
		
	public static void main(String[] args)
	{
		int n = 523123;
		int c =2;
		rotateNumber.rotateNo(n, c);
		c=-2;
		rotateNumber.rotateNo(n, c);
	}
}