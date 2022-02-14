package Filehandling;



	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class DemoDeserialize {

		public static void main(String[] args) {
			Employee e= null;
			try {
				FileInputStream filein = new FileInputStream("D:/MyEmployee.ser");
				ObjectInputStream in = new ObjectInputStream(filein);
				e = (Employee)in.readObject();
				in.close();
				filein.close();
			}
			catch(IOException i)
			{
				//i.printStackTrace();
				return;
			}
			catch(ClassNotFoundException c)
			{
				System.out.println("Employee Class not found");
				//c.printStackTrace();
				return;
			}
			System.out.println("Deserialized Employee...");
			System.out.println("Name :"+e.getName());
			System.out.println("Id :"+e.getId());

		}

	}

}
