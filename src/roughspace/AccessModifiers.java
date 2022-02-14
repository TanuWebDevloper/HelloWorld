package roughspace;

public class AccessModifiers {
	
	
	public void show() {
		System.out.println("Public data");
	}

	private void show1() {
		
		System.out.println("Private data");
		
	}
	
	void show2() {
		System.out.println("Default");
	}
	
	protected void show3() {
		
		System.out.println("Protected");
	}

}
