package array;

import java.util.Scanner;

public class ArrayShortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[5];
		
		System.out.println("enter values");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int small = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<small) {
				small=arr[i];
			}	
		}
		System.out.println(small);	

	}

}
