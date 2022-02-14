package stringExample;
import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		String str ="And , when you want something , all the universe conspires in helping you achieve it.";
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to find out it exits in the paragraph ot not:");
        String toFind = sc.next();
        int count =0;
      
        String[] str1 = str.split(" "); 
        
        int length = str1.length;
        for(int i=0;i<length;i++) {
        	
        	if(str1[i].equals(toFind)) {
        		count++;
        	}
        }
        if(count>0) {
        	
        	System.out.print("found!");
        }else {
        	System.out.print("not found!");
        }
        
        
    
        
       
	}

}
