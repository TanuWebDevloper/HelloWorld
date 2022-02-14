package oops_concept;

public class ConstructorDemo {
	

	
		public ConstructorDemo(int x)
		{
		System.out.println("the value of x"+x);	
		}
		public ConstructorDemo(int x,int y)
		{
			System.out.println("The sum of X and Y"+(x+y));
		}
		public static void main(String[] args) {
			//ConstructorDemo obj = new ConstructorDemo(10);
			//ConstructorDemo obj1 = new ConstructorDemo(20,30);
			new ConstructorDemo(10);
			new ConstructorDemo(20,30);
		}
	}

