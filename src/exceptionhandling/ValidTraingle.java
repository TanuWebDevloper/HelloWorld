package exceptionhandling;

import java.util.Scanner;

public class ValidTraingle {
	public static void Triangle(int x,int y,int z) throws MyException
	{	
		try{
			if(x+y+z == 180)
			System.out.println("YES , Triangle is Valid");
			else
			throw new MyException("");
	    }
	    catch(MyException e)
	    {
				System.out.println("TriangleNotValid");
		}
		finally
		{
			x=0;y=0;z=0;
		}
	}
	public static void main(String[] args) throws MyException {
		int x,y,z,n,i=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		n=sn.nextInt();
		for(i=0;i<n;i++)
		{	System.out.println("Enter Degree 1");
			x = sn.nextInt();
			System.out.println("Enter Degree 2");
			y = sn.nextInt();
			System.out.println("Enter Degree 3");
			z = sn.nextInt();
			Triangle(x,y,z);
			
		}
		sn.close();
	}


				 
			 		 
		
	 }

