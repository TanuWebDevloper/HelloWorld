package oops_concept;

public class NestedStaticDemo {
	
	

		void OuterHello()
		{
			System.out.println("my class1");
		}
		static class InnerDemo
		{
			int x = 100;
			void InnerHello1() {
				NestedStaticDemo obj = new NestedStaticDemo();
				obj.OuterHello();
				System.out.println("My innerclass1");
			}
		}
		void demoMethod()
		{
			System.out.println("DemoMethod");
			InnerDemo obj = new InnerDemo();
			obj.InnerHello1();
			
		}
		public static void main(String[] args) {
			NestedStaticDemo.InnerDemo obj = new NestedStaticDemo.InnerDemo();
			obj.InnerHello1();
		}
	}


