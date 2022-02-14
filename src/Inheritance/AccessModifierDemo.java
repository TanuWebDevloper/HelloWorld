package Inheritance;

public class AccessModifierDemo {

	

		private void show()
		{
			System.out.println("Private class so you can access within class only");
		}
		public static void main(String[] args) {
			AccessModifierDemo obj = new AccessModifierDemo();
			obj.show();
			AccessModifierMain obj1 = new AccessModifierMain();
			AccessModifierMain.Sub obj2 = obj1.new Sub();
			obj1.show1();
			obj1.show3();
			obj1.show2();
			obj2.show7();
			obj2.show5();
			obj2.show6();
			
		}
	}

