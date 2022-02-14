package exceptionhandling;

public class Custom_exception{
	
	public static void validforVote(int age) throws MyException{
		
		if(age<18) {
			
			throw new MyException("notvalidforvote");
		}
	}
	
	public static void main(String[] args) throws MyException{
		
		validforVote(19);
	}

}
