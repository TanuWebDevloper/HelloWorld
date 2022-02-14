package array;

import java.util.Scanner;

public class InsetionSort {
	

	public static void main(String[] args) {
		
		
        int[] arr= new int[5];//definition of an array
        
        
		//taking the value from user
		System.out.println("enter values");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//printing the array before sorting
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
		}
	//sorting array
		int i,j,temp;
		for(i=1;i<arr.length;i++) {
			temp=arr[i];
			for(j=i-1;j>=0 && temp<=arr[j];j--) {
				
				arr[j+1]=arr[j];
			}
			 arr[j+1] =temp;
		}
		
	//printing the array after sorting
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		

	}

}
