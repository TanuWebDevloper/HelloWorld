package raughspace2;

import roughspace.AccessModifiers;

public class acmd2 {

	

		
	public static void main(String[] args) {
			
			AccessModifiers obj =new AccessModifiers();
			
			obj.show(); //public type method and accessible in another class
			//obj.show1(); // this is the private type member fn so not accessible out side the class
			//obj.show2(); // default type member fn - not accessible by outside the pakage
			//obj.show3();//protected member fn - same with protected mem fn

		}



	}


