package oops_concept;
import static java.lang.System.out;

public class StaticDemo {
	static String s2;
	String s1;
	final static int x;
	
	static {
		x=100;
		out.println("static block"+x);
	}
	
	public staticDemo(String s1 , String s2) {
		this.s1=s1;
		this.s2=s2;
	}
	
	static void display() {
		out.println(s2);
	}
	
	void show() {
		out.println(s2+"is a "+s1);
	}
	public static void main(String[] args) {
		
		StaticDemo obj =new staticDemo("programming language" "java");

	}

}
