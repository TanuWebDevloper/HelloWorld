package Abstraction;


	public class AbsMain {

		public static void main(String[] args) {
			//Circle obj = new Circle();
			//Sphere obj1 = new Sphere();	
			Shape obj;
			obj = new Circle();
			obj.show("Area of Circle is ");	
			obj.area(45, 34);
			obj = new Sphere();
			obj.show("Volume of Circle is ");
			obj.volume(4, 5, 6);
			Shape obj1 = new Shape() {

				@Override
				void area(int i, int j) {
					// TODO Auto-generated method stub
					System.out.println("Annonymous is working");
				}

				@Override
				void volume(int i, int j, int k) {
					// TODO Auto-generated method stub
					
				}
		};
			obj1.area(4, 6);}
	}


