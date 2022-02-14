package Filehandling;


	import java.io.Serializable;

	public class Employee implements Serializable {
		public Employee(int id, String name) {
			this.id = id;
			this.name = name;
		}private transient int id=0;
		//private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;

	}

