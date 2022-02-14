package stringExample;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		boolean b= false;
		String str1 = "race";
		String str2 = "care";
		
		if(str1.length()==str2.length()) {
			
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			
			
			b = Arrays.asList(charArr1).contains(charArr2);
			
			if(b==false) {
			System.out.println("anagrams");
		}
		
		}else {
			System.out.println("not anagrams");
		}

	}

}
