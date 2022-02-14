package threads;

class M1 extends Thread {
	
	Synchro s;
	
	M1(Synchro s){
		this.s=s;
		start();
	}
	public void run() {
		s.deposite(1000);
	}
}

class M2 extends Thread {
	Synchro s;
	M2(Synchro s){
		this.s=s;
		start();
	}
	public void run() {
		s.deposite(500);
	}
}

public class Synchro {
	int bal =1000;
	synchronized void deposite(int amnt);{
		int temp=bal;
		temp=temp+amnt;
		try {}
		Thread.sleep(1000);
	}catch(Exception e) {}
	bal=temp;
	System.out.println("account balance=" +bal);
	
}


  public static void main(String[] args) {
	Synchro s= new Synchro();
	System.out.println(s);
	new.M1(s);
	new.M2(s);	
}

 

