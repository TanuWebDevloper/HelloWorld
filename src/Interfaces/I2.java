package Interfaces;


	
	

	public interface I2 {
		int s=100;
		void show();
		public static void display()
		{
			System.out.println("Belongs to I2");
		}
		default void display1()
		{
			System.out.println("Default method from I2");
		}
	}

