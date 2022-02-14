package Polymorphism;

public class Poly01 {
	
	
		String name,course;
		Poly01(String name,String course)
		{
			this.name=name;
			this.course=course;
		}
		void getdata(int m1,int m2)
		{
			double a = (m1+m2)/2;
			System.out.println("Average of mark form Poly1 is "+a);
		}
		void display(int roll)
		{
			System.out.println("Your roll number from Poly1 is "+roll);
		}
	}


