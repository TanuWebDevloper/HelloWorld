package oops_concept;

public class EncapsulationDemo {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Getter_Setter obj = new Getter_Setter();
			Getter_Setter obj1 = new Getter_Setter();
			obj.setN("Dinesh");
			obj.setX(20);
			obj1.setN("kumar");
			obj1.setX(50);
			Getter_Setter obj2 = new Getter_Setter(34,"Vijay");
			System.out.println(obj.getX());
			System.out.println(obj.getN());
			System.out.println(obj1.getX());
			System.out.println(obj1.getN());
			System.out.println(obj2.getX());
			System.out.println(obj2.getN());
		}

	}


