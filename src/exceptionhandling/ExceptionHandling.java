package exceptionhandling;

public class ExceptionHandling {
	
	
	int var=100;
	ExceptionHandling obj;
	
	
	public  ExceptionHandling(String msg) {
		
		try {
			System.out.println(obj.var);
		}catch(NullPointerException e) {
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		
		ExceptionHandling object =new ExceptionHandling("tanu");
		
		int a=10;
		try {
			int x =a/0;
		}catch(ArithmeticException e) {
			System.out.println("");
		}
		finally {
			
			System.out.println("i will execute the code at any how , im finally");
		}
		
		System.out.println("end of programme");

	}

}
