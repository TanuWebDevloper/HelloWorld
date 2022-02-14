package Interfaces;



	public class InterDemo implements I1,I2{
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("Method overriding is here");
		} 
		public InterDemo() {
			this.defmethod();
		}
		static void staticdemo()
		{
			System.out.println(I1.x+I2.s);
		}
	}

