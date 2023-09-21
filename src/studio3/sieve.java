package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("What's the value of n?");
		int Prime= in.nextInt();
		int p=2;
		int[] number = new int[40];
		int i;
		for(i=2;i<40;i++)
		{
			number [i-2]=i;
		}
		
		
			for(p=2;p<Prime;p++)
			{
				for(int j=2;j<Prime;j++)
				{
					if(p*j<Prime)
					{
						int not= p*j; 
						not = 0;
						{
						System.out.println("Those numbers are prime numbers"+number[i-2]);
						}
					}
					
				}
			}
				
			
	}

	

}
