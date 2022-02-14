package array;
import java.util.Scanner;

public class Array_Digonal {
	
	public static void main(String[] args) {
		
		int sum=0;
		System.out.println("enter matrix");
		Scanner sc =new Scanner(System.in);
		int a[][] = new int[3][3];
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				a[row][col]=sc.nextInt();
			}
		}
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
			System.out.print(a[row][col]+"\t");			
			}
			System.out.println();
		}
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(row==col)
					sum=sum+a[row][col];
			}
		}
		System.out.println(sum);
		
			}
		
	}


