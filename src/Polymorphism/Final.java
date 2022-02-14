package Polymorphism;


	
	//final class can not be inherited
	public final class Final{
		//final variable can not be changed
		final int x =100;
		public Final() {
			// TODO Auto-generated constructor stub
		}
		//final method cannot be overrided
		final void show()
		{
			System.out.println(x);
		}

		public static void main(String[] args) {
			Final obj = new Final();
			obj.show();

		}}

