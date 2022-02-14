package Polymorphism;


	public class Poly02 extends Poly01{
		String contact;
		Poly02(String name,String course,String contact)
		{
			super(name,course);
			this.contact=contact;
			
		}
		void getdata()
		{	super.getdata(23, 45);
		
		}
		void display(int roll)
		{            
			super.display(roll);
			System.out.println(roll+" "+name+" "+course+" "+contact);
		}
	}


