package patternProgramming;

public class Patterns02 {

	public static void main(String[] args) {
		 
		int al = 97;
		for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((char)(al+k));
			}
			for(int l=i-1;l>=0;l--) {
				
				System.out.print((char)(al+l));
				
			}
			System.out.println();
		}

	}

}
