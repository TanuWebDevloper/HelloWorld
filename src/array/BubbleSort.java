package array;

import java.util.Scanner;

public class BubbleSort {

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
	//sorting array with bubble sort
		
		int i,j,temp;
		int t= arr.length;
		for(i=1;i<t;i++) {
	
			for(j=0;j<t-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}				
				
			}
			}
		
	//printing the array after sorting
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
}

