package array;

import java.util.Scanner;

public class ShiftArray {

	public static void main(String[] args) {
		
        int[] arr= new int[5];
		
		System.out.println("enter values");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.print("enter the position");
		int index = sc.nextInt();
		
		System.out.print("enter value");
		int x = sc.nextInt();
		
		int temp =arr[index];
		arr[index]=arr[index+1];
		arr[index+1]=temp;		

	}
	

}
