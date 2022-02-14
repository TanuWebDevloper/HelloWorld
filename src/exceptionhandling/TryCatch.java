package exceptionhandling;

public class TryCatch {
	
		int x = 100;
		TryCatch obj;
		public TryCatch(String msg)
		{try
			{
			System.out.println(obj.x);
			}
		catch(NullPointerException e)
			{
			System.out.println(e);
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TryCatch object = new TryCatch("abc");
			int a = 10;
			try {
				int y = a/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("finnally block is executed");
			}
		}

	}

