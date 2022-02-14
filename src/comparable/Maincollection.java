package comparable;


	

	import java.util.ArrayList;
	import java.util.Collections;

	public class Maincollection {

		public static void main(String[] args) {
			// TODO Auto-generated method
			BeanClass bean = new BeanClass("Red", "Zara", 12000.34);
			BeanClass bean1 = new BeanClass("Black","Arrow",1234.23);
			BeanClass bean2 = new BeanClass("Blue", "Guess", 79595.23);
			ArrayList<BeanClass> al = new ArrayList<BeanClass>();
			al.add(bean);
			al.add(bean1);
			al.add(bean2);
			Collections.sort(al);
			for(BeanClass obj : al)
			{
				System.out.println("Brand ::"+obj.getBrand());
				System.out.println("Price ::"+obj.getPrice());
				System.out.println("Color ::"+obj.getColor());
				System.out.println(""+obj);
			}
			
		}

	}


