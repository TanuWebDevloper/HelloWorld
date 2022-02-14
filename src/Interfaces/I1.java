package Interfaces;


	public interface I1 {
		int x = 100;//public static variable/constant
		void show();//public abstract method
		//Static method
		public static void staticdemo()
		{
			System.out.println("Method from I1");
		
		}
		default void defmethod()
		{
			System.out.println("Default method from I1");
		}
	}


