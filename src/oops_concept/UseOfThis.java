package oops_concept;



	public class UseOfThis {
		String name;
		public UseOfThis(String name)
		{
			this.name = name;
		}
		public UseOfThis()
		{
			System.out.println("Default Constructor");
		}
		public void show()
		{
			System.out.println("your name is "+name);
		}
		public static void main(String[] args) {
			UseOfThis obj = new UseOfThis("Dinesh");
			obj.show();
			UseOfThis obj1 = new UseOfThis("Kumar");
			obj1.show();
			UseOfThis obj2 = new UseOfThis();
			obj2.show();
		}
	}


