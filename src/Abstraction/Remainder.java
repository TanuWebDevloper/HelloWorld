package Abstraction;


	import java.util.Scanner;

	public class Remainder {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n,i,j,x=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of test cases");
			n = sc.nextInt();
			for(i=0;i<n;i++)
			{	
				i=sc.nextInt();j=sc.nextInt();			
				x = i%j;
				System.out.println(x);
				x=0;
				System.out.println("Enter next number");
			}
			sc.close();
		}

	}


