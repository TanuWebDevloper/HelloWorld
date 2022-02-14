package stringExample;
import java.util.Scanner;

public class PalindromeOfWord {

	public static void main(String[] args) {
		
	 String original , reverse ="";
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a string to check it is palindrome or not:");
	 
	 original=sc.next();
	 
	 int length = original.length();
	 
	 for(int i =length-1;i>=0;i--) {
		 reverse = reverse + original.charAt(i);
		 
	 }
	 
	 if(reverse.equals(original)) {
		 System.out.print(" it is palindrome");
	 }
	 else {
		 System.out.print("not palindrome");
	 }

	}

}
