package array;

import java.util.Scanner;

public class SeletionSort {

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
		
		int t=arr.length;
		for(int i=0;i<t-1;i++) {
			
			int mi=i;//seting the first/current element minimum
			
			for(int j=i+1;j<t;j++) {
				
				if(arr[j]<arr[mi]) {//checking arr[1]<arr[0] if true then swap
					mi=j;
				}
				
			//int temp =arr[keyi];
			//arr[keyIndex]=arr[i];
			//arr[i]=temp;
				
			}
			
			int temp =arr[mi];
			arr[mi]=arr[i];
			arr[i]=temp;
		}
		
	//printing the array after sorting
		
		for(int i=0;i<t;i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		

	}




	}


