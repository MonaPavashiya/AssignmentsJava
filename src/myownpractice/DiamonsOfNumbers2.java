package myownpractice;

public class DiamonsOfNumbers2 
{/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
  3 3 3 
   2 2 
    1 

*/

	public static void main(String[] args) 
	{
		for (int i=1;i<=3;i++) 
		{
			for(int j=i;j<=4;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
			System.out.print(i + " ");
			
		}
			System.out.println();
	}
	
		for (int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=4;j++)
			{
			System.out.print(5-i +" ");
			
		}
			System.out.println();
	}
	}

}
