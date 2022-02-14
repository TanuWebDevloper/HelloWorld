package Inheritance;

public class AccessModifierMain {
	

		private void show()
		{
			System.out.println("Private from another class");
		}
		protected void show1()
		{
			System.out.println("Protected from another class");
		}
		void show2()
		{
			System.out.println("Default method");
		}
		public void show3()
		{
			System.out.println("Public method");
		}
		public class Sub
		{
			private void show4()
			{
				System.out.println("Private from sub class");
			}
			protected void show5()
			{
				System.out.println("Protected from sub class");
			}
			void show6()
			{
				System.out.println("Default method from subclass");
			}
			public void show7()
			{
				System.out.println("Public method from subclass");
			}
		}
	}

