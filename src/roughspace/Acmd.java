package roughspace;

public class Acmd {

	public static void main(String[] args) {
		
		AccessModifiers obj =new AccessModifiers();
		
		obj.show(); //public type method and accessible in another class
		//obj.show1(); // this is the private type member fn so not accessible out side the class
		obj.show2(); // default type member fn
		obj.show3();//protected member fn

	}

}
