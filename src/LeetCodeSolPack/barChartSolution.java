package LeetCodeSolPack;
//Print bar chart using asterik based on array value
public class barChartSolution {

	 public static void printBarChart(int [] barArray)
	 {
		 int max = barArray[0];
		 for(int i =1;i<barArray.length;i++)
		 {
			 if(max<barArray[i])
			 {
				 max = barArray[i];
			 }
			 
		 }
		 for(int floor = max;floor>=1;floor--)
		 {
			 for(int i =0;i <barArray.length;i++)
			 {
				 if(barArray[i]>=floor)
				 {
					 System.out.print("*\t");
				 }
				 else
				 {
					 System.out.print("\t");
					 
				 }
				
			 }
			 System.out.println();
		 }
	 }	
	 public static void main(String[] args)
	 {
		int [] val = {5,3,6,1,2,5}; 
		barChartSolution.printBarChart(val);
					
	 }	
}
