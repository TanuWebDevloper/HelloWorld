package stringExample;

import java.util.Scanner;

public class InputString {
	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			
			String str=sc.next();
			
			String str1 = str.toLowerCase();
			
			int vowel =0,cons=0;
			
			
			for(int i=0;i<str1.length();i++) {
				
				char c = str1.charAt(i);
				
				if(c == 'a' || c == 'e'|| c=='i' || c=='o' || c=='u') {
					
					vowel++;
				}
				else {
					cons++;
				}
					
			}
			
			System.out.println("number of vowels" +vowel);
			System.out.println("number of consonants " +cons);

		}

	}


