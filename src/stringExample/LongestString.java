package stringExample;

public class LongestString {

	public static void main(String[] args) {
		
		String str ="lives in";
		
		int l= str.length();
		boolean bl=false;
		
		for(int i=0;i<l;i++ ,l--) {
			
			if(str.charAt(i) != str.charAt(l-1))
				bl=false;
				
		}
		
		if(bl=true) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}

}
