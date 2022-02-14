package Abstraction;

	public abstract class Shape {
		
		abstract void area(int i,int j);
		abstract void volume(int i,int j,int k);
		void show(String Message)
		{
			System.out.println(Message);
		}
		
	}


