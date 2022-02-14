package stringExample;


public class CountVowelAndConsonent {

	public static void main(String[] args) {
		
		int vowel =0,cons=0;
		String str = "tanushree hi kya haal hai";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
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
